<%@page language="java" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.io.DataOutputStream"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>

<!-- 2012年11月20日10:02:23 WEISY -->

<%!public static Connection getConnection(String sys) {
		//Connection conn = connThreadLocal.get();
		Connection conn = null;
		if (conn == null) {
			try {
				//Oracle
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				//conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL", "aaa", "bbb");
				Class.forName("com.ibm.db2.jcc.DB2Driver");
				String url = "";
				String username = "";
				String password = "";
				// 各个系统使用各系统独立的cipher
				if("DMT".equalsIgnoreCase(sys))
				{
					url = "jdbc:db2://10.96.20.176:50000/dmt";
					username = "db2ovp";
					password = "db2ovp6";
				} else if("DMT2".equals(sys))
				{
					url = "jdbc:db2://10.96.20.176:50000/dmt2";
					username = "db2ovp";
					password = "db2ovp6";
				} else if("DMD".equals(sys))
				{
					url = "jdbc:db2://10.96.13.245:50000/dmd";
					username = "db2ovp";
					password = "db2ovp";
				} else if("DMD2".equals(sys))
				{
					url = "jdbc:db2://10.96.13.245:50000/dmd2";
					username = "db2ovp";
					password = "db2ovp";
				}
				conn = DriverManager.getConnection(url, username, password);
				//connThreadLocal.set(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				throw new java.lang.RuntimeException(e);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new java.lang.RuntimeException(e);
			}
		}
		return conn;
	}
%>
<%
	String path = request.getParameter("ovpLink");
	String cipher = request.getParameter("cipher");
	//System.out.println("path=" + path);
	//System.out.println("cipher=" + cipher);
	
	// 如果输入密文，则以输入为主，方便测试
	if(null == cipher || "".equals(cipher.trim())) {
		String qLink = "http://tst-ovp.lenovo.com/lenovo-ovp";//DMT2
		String dLink = "http://10.96.13.245:10080/lenovo-ovp";//DMD2
		String er2Link = "http://tst-ovp.lenovo.com/lenovo-ovp-new";//DMT
		String weLink = "http://10.96.13.245:10080/lenovo-ovp-we";//DMD
		//String pLink = "http://ovp.lenovo.com/lenovo-ovp";//P
		//String w3Link = "http://tst-ovp.lenovo.com/lenovo-ovp-w3";//
		//String localLink = "http://localhost:8080/lenovo-ovp-web";//
		
		String reqSys = request.getParameter("requestorSystem");
		
		Connection conn = null;
		PreparedStatement pt = null;
		ResultSet rs = null;
		//每个系统只需要一条
		String sql = " SELECT CIPHER FROM OVPAPP.OVP_SSO WHERE EXT_SYS = ? ";
		try {
			// 获得连接
			if(qLink.equalsIgnoreCase(path))
			{
				conn = getConnection("DMT2");
			} else if(dLink.equalsIgnoreCase(path)) {
				conn = getConnection("DMD2");
			} else if(er2Link.equalsIgnoreCase(path)) {
				conn = getConnection("DMT");
			} else if(weLink.equalsIgnoreCase(path)) {
				conn = getConnection("DMD");
			} else {
				// default, query the Q database.
				conn = getConnection("DMT2");
			}	
			// 准备
			pt = conn.prepareStatement(sql);
			pt.setString(1, reqSys);// index begin from 1
			rs = pt.executeQuery();
			if (rs.next()) {
				cipher = rs.getString("CIPHER");
			}
		} catch (Exception e) {
			e.printStackTrace();
			out.println("Sorry, DataBase Access Fail ! <br>Detail: " + e.getMessage());
			return;
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pt != null) {
				try {
					pt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}//end finally
	}
	//System.out.println(cipher.toString());
	
	String params = request.getQueryString();
	String success = "success:token";
	String error = "error|";
	String noRet = "Error, OVP return nothing";

	// Modify to the right path. and try catch the excpetion and handle it.
	String postUrl = path + "/sso";
	try {
		URL url = new URL(postUrl);
		// open connection
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);
		connection.setDoInput(true);
		// Default is GET
		connection.setRequestMethod("POST");
		connection.setUseCaches(false);
		// only affect current funciton
		connection.setInstanceFollowRedirects(true);
		connection.connect();
		// get output from connection
		DataOutputStream dops = new DataOutputStream(connection.getOutputStream());
		// send content to server
		//cipher = "871D008D79014D019D7814CD5BCCAF9B";
		String content = "cipher=" + cipher + "&" + params;
		System.out.println(content);
		dops.writeBytes(content);
		dops.flush();
		dops.close();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String msg = reader.readLine();
		//System.out.println("-----WEISY >> msg=" + msg);
		if (msg == null) {
			out.println(noRet);
			return;
		} else if (msg.startsWith(success)) {
			String pm = msg.substring(msg.indexOf(":") + 1);
			String go = path + "/chksso?" + pm + "&" + params;
			response.sendRedirect(go);
		} else if (msg.startsWith(error)) {
			out.print(msg.substring(msg.indexOf("|") + 1));
			return;
		}
		// close connection
		reader.close();
		connection.disconnect();
	} catch (Exception e) {
		e.printStackTrace();
		out.println("<font color='red'><B>OVP SSO Error Message: " + e.getMessage() + "</B>");
		out.println("<br/>");
		out.println("---->SSO Error Stack: </font>");
		out.println("<br/>");
		for(int i=0; i<e.getStackTrace().length; i++)
		{
			StackTraceElement se = e.getStackTrace()[i];
			out.println(se.toString()+"<br/>");
		}
	}
%>
