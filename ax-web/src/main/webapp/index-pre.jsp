<%@ page language="java" pageEncoding="UTF-8"%>
<!-- 
	History 
	Version:1.2  2012-03-02 14:13:44 
	Version:1.5  2012-11-19 17:56:32 
	WEISY
 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>OVP Client</title>
    <script type="text/javascript">
    	String.prototype.trim = function (){
	    	return this.replace(/(^\s*)|(\s*$)/g , '');
	 	}
		function jumpToOVP(){
		    //var newsltn = document.getElementById("newsltn");
		    //var isNew = newsltn.checked;
		    var ok = true;
		    var loginType = document.getElementById("loginType").value;// public/sso
   			var ovpLink = document.getElementById("ovpLink").value;// D/Q/Local
   			var pSystem = "http://ovp.lenovo.com/lenovo-ovp";
   			if('-1' == ovpLink)
   			{
	   			var ovpLink2 = document.getElementById("ovpLink2").value;
   				if(ovpLink2 == "" || ovpLink2.trim().length == 0)
   				{
   					alert("Please select or enter the system you want to access");
   					return;
   				}
	   			ovpLink = ovpLink2.trim();
   			}
   			var userId = document.getElementById("userId").value;
   			var soldTo = document.getElementById("soldTo").value;
   			var reqSys = document.getElementById("reqSys").value;
   			
   			// bussiness
   			if(! procMsg(document.getElementById("soldTo"), 2) || ! chkCipher()) {
   				ok = false;
   			}
   			//alert("ok=" + ok);
   			if(!ok) {
   				return;
   			}
   			var nodeLevel = document.getElementById("nodeLevel").value;
   			var dateFormat = document.getElementById("dateFormat").value;
   			var language = document.getElementById("language").value;
   			var userEmail = document.getElementById("userEmail").value;
   			var currencyDecimal = "dot";
   			// other
   			var firstName = document.getElementById("firstName").value;
   			var lastName = document.getElementById("lastName").value;
   			var timeZone = document.getElementById("timeZone").value;
   			var country = document.getElementById("country").value;
   			var cipher = document.getElementById("cipher").value;
   			if(cipher=='object'||cipher=='undefined') {
   				cipher == '';
   			}
   			 var pm = "?soldTo="+soldTo
		    		+"&userId="+userId
		    		// old solution need
		    		+"&requestorSystem="+reqSys
   					+"&nodeLevel="+nodeLevel
   					+"&userEmail="+userEmail
   					+"&dateFormat="+dateFormat
   					+"&currencyDecimal="+currencyDecimal
   					+"&country="+country
   					+"&timeZone="+timeZone
   					+"&firstName="+firstName
   					+"&lastName="+lastName
   					+"&language="+language
   					// old
   					+"&request_locale="+language
   					+"&cipher="+cipher
   					+"&ovpLink="+ovpLink;
			// public login way is same
			var url = "";		
   			if("public" == loginType){
   				url = ovpLink + "/public/showDetail!publicStatusIndex.action";
   			}else{
	   			url = "sso.jsp" + pm;
   			}
   			window.location = url;
   			//window.open(url, 'NewWindow', 'height=800, width=1280, top=0, left=0, toolbar=yes, menubar=yes, scrollbars=yes, resizable=true,location=no, status=no');
		}
		
		// Here I full realized linkage when user enter some words or delete all words
		function procMsg(obj, num) {
			//var reg = /^\S+|\S+$/g;
			var reg = /^.*\S+.*$/g;
			var val = obj.value;
			var reqSys = document.getElementById("reqSys").value;
			if(reg.test(val) ||(obj.id == "soldTo" && reqSys == "WEBUI")) {
				document.getElementById("msg"+ num).style.display = "none";
				return true;
			} else {
				document.getElementById("msg"+ num).style.display = "";
				return false;
			}
		}
		
		function chkCipher() {
			var ovpLink = document.getElementById("ovpLink").value;
			var cipher = document.getElementById("cipher").value;
			var reg = /^.*\S+.*$/g;
			if("http://ovp.lenovo.com/lenovo-ovp" == ovpLink && !reg.test(cipher)) {
				document.getElementById("cpSpan").style.display = "";
				return false;
			}
			document.getElementById("cpSpan").style.display = "none";
			return true;
		}
    </script>
  </head>  
  <body onload="document.getElementById('soldTo').focus();" style="background-color: #F1FAFA">
  <div style="margin-top: 10px;"></div>
<center>
 <h1>Lenovo OVP Client 1.5</h1>
  <div style="margin-top: 5px;"></div>
 <h2><a href="javascript: jumpToOVP();" title="Click here to Levnovo OVP" onclick="">Order Report Portal</a></h2>
</center>  
    <div class="pbody" style="display: block;">
		    <div class="h_15"></div>
			<div class="h_15"></div>
			<div style="align:center;margin-left:350px;margin-top:25px;">
			   <table width="93%" border="0">
			    <!-- 
			   	 <tr>
			   	 	<td width="23%">Solution Type:</td>
			   	 	<td>
			   	 		<input type="radio" name="solution" id="newsltn" checked="checked"/>New
			   	 		&nbsp;
			   	 		<input type="radio" name="solution" id="oldsltn"/>Old
			   	 	</td>
			   	 </tr>
			    -->
			   	 <tr>
			   	 	<td width="23%">Login Type:</td>
			   	 	<td>
			   	 		<select name="loginType" id="loginType">
				         	<option value="sso" selected="selected">sso</option>
				         	<option value="public">public</option>
			         	</select>
			   	 	</td>
			   	 </tr>
			     <tr>
			     	<td>Please select the system you want access:</td>
			     	<td>
			     		<select name="ovpLink" id="ovpLink" size="1" onchange="chgLink(this);">
				         	<option value="http://tst-ovp.lenovo.com/lenovo-ovp" selected="selected">Q:&nbsp;&nbsp;http://tst-ovp.lenovo.com/lenovo-ovp</option>
				         	<option value="http://10.96.13.245:10080/lenovo-ovp">D:&nbsp;&nbsp;http://10.96.13.245:10080/lenovo-ovp</option>
							<option value="http://tst-ovp.lenovo.com/lenovo-ovp-new">ER2:&nbsp;&nbsp;http://tst-ovp.lenovo.com/lenovo-ovp-new</option>
				         	<option value="http://ovp.lenovo.com/lenovo-ovp">P:&nbsp;&nbsp;http://ovp.lenovo.com/lenovo-ovp</option>
							<option value="http://10.96.13.245:10080/lenovo-ovp-we">WE:&nbsp;&nbsp;http://10.96.13.245:10080/lenovo-ovp-we</option>
				         	<option value="http://tst-ovp.lenovo.com/lenovo-ovp-w3">W3:&nbsp;&nbsp;http://tst-ovp.lenovo.com/lenovo-ovp-w3</option>
							<option value="http://10.96.20.176:9080/lenovo-ovp-new">10.96.20.176&nbsp;&nbsp;http://10.96.20.176:9080/lenovo-ovp-new</option>
							<option value="http://10.96.20.180:9080/lenovo-ovp-new">10.96.20.180&nbsp;&nbsp;http://10.96.20.180:9080/lenovo-ovp-new</option>
				         	<option value="http://localhost:8080/lenovo-ovp-web">Local:&nbsp;&nbsp;http://localhost:8080/lenovo-ovp-web&nbsp;&nbsp;</option>
				         	<option value="http://localhost/lenovo-ovp-web">Local:&nbsp;&nbsp;http://localhost/lenovo-ovp-web</option>
				         	<option value="-1">other</option>
				         </select>
				         <input type="text" name="ovpLink" id="ovpLink2" size="40" style="display: none;">
			     	</td>
			     </tr>
			     <tr>
			     	<td>User ID:</td>
			     	<td><input type="text" name="userId" id="userId" value="Narash"></td>
			     </tr>
			     <tr>
			       <td>Sold To: </td>
			       <td><input type="text" name="soldTo" id="soldTo" value="" onblur="procMsg(this, 2);" size="40"/>&nbsp;<span id="msg2" style="color: red;display: none;">Please enter soldTo when request system is not webUI</span></td>
			     </tr>
			     <tr>
			     	<td>Cipher:</td>
			     	<td><input type="text" name="cipher" id="cipher" value="" size="40"/>&nbsp;<span id="cpSpan" style="color: red;display: none;">Access to the production environment, Please enter cipher</span></td>
			     </tr>
			     <tr>
			       <td>Date Format: </td>
			       <td>
			         <select name="dateFormat" id="dateFormat">
			         	<!-- y-m-d -->
			         	<option value="YYYY-MM-DD">YYYY-MM-DD</option>
			         	<option value="YYYY.MM.DD">YYYY.MM.DD</option>
			         	<option value="YYYY/MM/DD">YYYY/MM/DD</option>
						<!-- m-d-y -->
						<option value="MM-dd-yyyy">MM-dd-yyyy</option>
			         	<option value="MM/dd/yyyy">MM/dd/yyyy</option>
			         	<option value="MM.dd.yyyy">MM.dd.yyyy</option>
						<!-- d-m-y -->
						<option value="dd-MM-yyyy">dd-MM-yyyy</option>
			         	<option value="dd/MM/yyyy">dd/MM/yyyy</option>
			         	<option value="dd.MM.yyyy">dd.MM.yyyy</option>
			         </select>
			       </td>
			     </tr>
			     <tr>
			       <td>Language: </td>
			       <td>
			         <select name="language" id="language">
			           <option value="en">English</option>
			           <option value="ar">阿拉伯语</option>
			           <option value="tr">土耳其语</option>
			           <option value="zf">繁體中文</option>
			           <option value="ja">日语</option>  
			           <option value="ko">한국어</option>
			           <option value="pt">葡萄牙语</option>
			           <option value="ru">俄语</option>
			           <option value="fr">法语</option>   
			         </select>
			       </td>
			     </tr>
			     <tr>
			       <td>RequestorSystem: </td>
			       <td>
			         <select name="reqSys" id="reqSys">
			           <option value="WEBUI" selected="selected">WebUI</option>
			           <option value="LPO">LPO</option>
			           <option value="EMISA">EMISA</option>
			           <option value="JDA">JDA</option>			           
			           <option value="LEOS">LEOS</option>
			           <option value="PORTAL">Sales Portal</option>
			         </select>
			       </td>
			     </tr>
			     <tr>
			       <td>User Email: </td>
			       <td>
			         <input type="text" name="userEmail" id="userEmail" value="liuhb7@lenovo.com">
			       </td>
			     </tr>
			     <tr>
			       <td>Node Level: </td>
			       <td>
			         <select name="nodeLevel" id="nodeLevel">
			           <option value="INTERNAL">Internal</option>
			           <option value="CHANNEL">Channel</option>
			           <option value="LE">LE</option>
			         </select>
			       </td>
			     </tr>
			     <tr>
			       <td>Currency Decimal: </td>
			       <td>
			         <input type="text" id="currencyDecimal" value="dot" readonly="readonly">
			       </td>
			     </tr>
			     <tr>
			       <td>Country</td>
			       <td> 
			       	<input id="country" name="country" value="US"/>
			       </td>
			     </tr>
			     <tr>
			       <td>FirstName</td>
			       <td> 
			       	<input id="firstName" name="firstName" value="FirstName"/>
			       </td>
			     </tr>
			     <tr>
			       <td>LastName</td>
			       <td> 
			       	<input id="lastName" name="lastName" value="LastName"/>
			       </td>
			     </tr>
			     <tr>
			       <td>Time Zone: </td>
			       <td>
			         <select name="timeZone" id="timeZone" class="selec_bo">
						<option value="-12" >(GMT - 12:00 hours) Enitwetok, Kwajalien</option>
						<option value="-11" >(GMT - 11:00 hours) Midway Island, Samoa</option>
						<option value="-10" >(GMT - 10:00 hours) Hawaii</option>
						<option value="-9" >(GMT - 9:00 hours) Alaska</option>
						<option value="-8" >(GMT - 8:00 hours) Pacific Time (US &amp; Canada)</option>
						<option value="-7" >(GMT - 7:00 hours) Mountain Time (US &amp; Canada)</option>
						<option value="-6" >(GMT - 6:00 hours) Central Time (US &amp; Canada), Mexico City</option>
						<option value="-5" >(GMT - 5:00 hours) Eastern Time (US &amp; Canada), Bogota, Lima</option>
						<option value="-4" >(GMT - 4:00 hours) Atlantic Time (Canada), Caracas, La Paz</option>
						<option value="-3.5" >(GMT - 3:30 hours) Newfoundland</option>
						<option value="-3" >(GMT - 3:00 hours) Brazil, Buenos Aires, Falkland Is.</option>
						<option value="-2" >(GMT - 2:00 hours) Mid-Atlantic, Ascention Is., St Helena</option>
						<option value="-1" >(GMT - 1:00 hours) Azores, Cape Verde Islands</option>
						<option value="0" selected>(GMT) Casablanca, Dublin, London, Lisbon, Monrovia</option>
						<option value="1" >(GMT + 1:00 hours) Brussels, Copenhagen, Madrid, Paris</option>
						<option value="2" >(GMT + 2:00 hours) Kaliningrad, South Africa</option>
						<option value="3" >(GMT + 3:00 hours) Baghdad, Riyadh, Moscow, Nairobi</option>
						<option value="3.5" >(GMT + 3:30 hours) Tehran</option>
						<option value="4" >(GMT + 4:00 hours) Abu Dhabi, Baku, Muscat, Tbilisi</option>
						<option value="4.5" >(GMT + 4:30 hours) Kabul</option>
						<option value="5" >(GMT + 5:00 hours) Ekaterinburg, Karachi, Tashkent</option>
						<option value="5.5" >(GMT + 5:30 hours) Bombay, Calcutta, Madras, New Delhi</option>
						<option value="6" >(GMT + 6:00 hours) Almaty, Colomba, Dhakra</option>
						<option value="7" >(GMT + 7:00 hours) Bangkok, Hanoi, Jakarta</option>
						<option value="8" selected="selected">(GMT + 8:00 hours) Hong Kong, Perth, Singapore, Taipei</option>
						<option value="9" >(GMT + 9:00 hours) Osaka, Sapporo, Seoul, Tokyo, Yakutsk</option>
						<option value="9.5" >(GMT + 9:30 hours) Adelaide, Darwin</option>
						<option value="10" >(GMT + 10:00 hours) Melbourne, Papua New Guinea, Sydney</option>
						<option value="11" >(GMT + 11:00 hours) Magadan, New Caledonia, Solomon Is.</option>
						<option value="12" >(GMT + 12:00 hours) Auckland, Fiji, Marshall Island</option>
					</select>
			       </td>
			     </tr>
			   </table>
			</div>
		</div>
		<a href="#" onclick="doSH();">How to use?</a>
		<div id="helpDiv" style="display: none;">
			You must fill out soldTo unless you selected the WEBUI Request System.
			<br>
			If the cipher is not right, please contact related person.
			<br>
			If there is not the system url you want to visit, please select the last item 'other' then input the url in the behind textbox.
			<br>
			If you don't follow these rules, you can't login into the system
			<br>
			Other conditions is the same with before.
			<br>
			Click the link 'Order Report Portal' to OVP.
		</div>
		<script type="text/javascript">
			var i = 0;
			function doSH()
			{
				if(i==0)
				{
					document.getElementById("helpDiv").style.display = "";
					i = 1;
				}
				else
				{
					document.getElementById("helpDiv").style.display = "none";
					i = 0;
				}
			}
			//
			function chgLink(com)
			{
				if(com.value == '-1')
				{
					document.getElementById("ovpLink2").disabled = false;
					document.getElementById("ovpLink2").style.display = "";
					document.getElementById("ovpLink2").focus();
				}else 
				{
					document.getElementById("ovpLink2").style.display = "none";
					document.getElementById("ovpLink2").disabled = true;
				}
			}
		</script>
  </body>
</html>
