<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<!-- 
	History 
	Version:1.2  2012-03-02 14:13:44 
	Version:1.5  2012-11-19 17:56:32 
	WEISY
 -->

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
   			
   			if(cipher=='object' || cipher=='undefined') {
   				cipher = '';
   				
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
   					+"&timezone="+timeZone
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
  <body onload="document.getElementById('soldTo').focus();">
      
  	  <div class="row">
  	       <div class="span6 offset3">
  	            <!-- 
              	      <a data-content="Vivamus sagittis lacus vel augue laoreet rutrum faucibus." data-placement="bottom" rel="popover" class="btn" href="#" data-original-title="Popover on top">Popover on top</a>
  	            
  	             -->
  	            <h2 class="align-center">Lenovo OVP Client 1.6</h2>
		  	    <h4 class="align-center"><a href="javascript: jumpToOVP();" title="Click here to Levnovo OVP" onclick="">Order Report Portal</a></h4>
				<form class="well form-inline form-horizontal">
		  	    	<legend>Access OVP</legend>
		  	    	
					<div id="login-type" class="control-group">
			            <label class="control-label" for="loginType">Login Type</label>
			            <div class="controls">
			                <select name="loginType" id="loginType">
						         	<option value="sso" selected="selected">sso</option>
						         	<option value="public">public</option>
					        </select>
			            </div>
			        </div>
			        <div id="ovp-link" class="control-group">
			            <label class="control-label" for="ovpLink">Please select the system you want access:</label>
			            <div class="controls">
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
						     
						     <input type="text" name="ovpLink" id="ovpLink2" style="display: none;">
						       
			            </div>
			        </div>
			        <div id="user-id" class="control-group">
			            <label class="control-label" for="userId">User ID</label>
			            <div class="controls">
			                <input type="text" name="userId" id="userId" value="Narash">
			            </div>
			        </div>
			        <div class="control-group">
			            <label class="control-label" for="soldTo">Sold To</label>
			            <div class="controls">
			                <input type="text" name="soldTo" id="soldTo" value="" onblur="procMsg(this, 2);" placeHolder="Not WebUI, value needed"/>&nbsp;<span id="msg2" style="color: red;display: none;">Please enter soldTo when request system is not webUI</span>
			            </div>
			        </div>
			        <div class="control-group">
			            <label class="control-label" for="cipher">Cipher</label>
			            <div class="controls">
			                <input type="text" name="cipher" id="cipher" value="" placeHolder="Access Production, value needed"/>&nbsp;<span id="cpSpan" style="color: red;display: none;">Access to the production environment, Please enter cipher</span>
			            </div>
			        </div>
			        <div class="control-group">
			            <label class="control-label" for="dateFormat">Date Format</label>
			            <div class="controls">
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
			            </div>
			        </div>
			        
			        <div class="control-group">
			            <label class="control-label" for="language">Language</label>
			            <div class="controls">
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
			            </div>
			        </div>
			        <div class="control-group">
			            <label class="control-label" for="reqSys">RequestorSystem</label>
			            <div class="controls">
			                <select name="reqSys" id="reqSys">
					           <option value="WEBUI" selected="selected">WebUI</option>
					           <option value="LPO">LPO</option>
					           <option value="EMISA">EMISA</option>
					           <option value="JDA">JDA</option>			           
					           <option value="LEOS">LEOS</option>
					           <option value="PORTAL">Sales Portal</option>
					         </select>
			            </div>
			        </div>
			        <div class="control-group">
			            <label class="control-label" for="userEmail">User Email</label>
			            <div class="controls">
			                <input type="text" name="userEmail" id="userEmail" value="sunning2@lenovo.com">
			            </div>
			        </div>
			        <div class="control-group">
			            <label class="control-label" for="nodeLevel">Node Level</label>
			            <div class="controls">
			                <select name="nodeLevel" id="nodeLevel">
					           <option value="INTERNAL">Internal</option>
					           <option value="CHANNEL">Channel</option>
					           <option value="LE">LE</option>
					        </select>
			            </div>
			        </div>
			        <div class="control-group">
			            <label class="control-label" for="currencyDecimal">Currency Decimal</label>
			            <div class="controls">
			                <input type="text" id="currencyDecimal" value="dot" readonly="readonly">
			            </div>
			        </div>
			        <div class="control-group">
			            <label class="control-label" for="country">Country</label>
			            <div class="controls">
							<input type="text" id="country" name="country" value="US"/>
			            </div>
			        </div>
			        <div id="first-name" class="control-group">
			            <label class="control-label" for="firstName">First Name</label>
			            <div class="controls">
							<input type="text" id="firstName" name="firstName" value="FirstName"/>
			            </div>
			        </div>
			        <div id="last-name" class="control-group">
			            <label class="control-label" for="lastName">Last Name</label>
			            <div class="controls">
							<input type="text" id="lastName" name="lastName" value="LastName"/>
			            </div>
			        </div>
			        <div id="time-zone" class="control-group">
			            <label class="control-label" for="timeZone">Time Zone</label>
			            <div class="controls">
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
			            </div>
			        </div>
			       
		  	    </form>
		  
		  <div class="row">
		       <div class="span6">
		       		<a href="#use" onclick="doSH();">How to use?</a>
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
		       </div>
		      </div> 
		  </div>
  	  </div>
  </body>
</html>
