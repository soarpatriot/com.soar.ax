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

  </head>  
  <body onload="document.getElementById('soldTo').focus();">
       
  	  <div class="row-fluid">
  	       <div class="span8 offset2">
  	                      
				<form class="well form-inline form-horizontal">
		  	    	<legend>Access OVP</legend>
					<div id="login-type" class="control-group">
			            <label class="control-label" for="loginType">Login Type</label>
			            <div class="controls">
			                <select name="loginType"  class="input-xlarge" id="loginType">
						         	<option value="sso"  selected="selected">sso</option>
						         	<option value="public">public</option>
					        </select>
			            </div>
			        </div>
			        <div id="ovp-link" class="control-group">
			            <label class="control-label" for="ovpLink">Please select the system you want access:</label>
			            <div class="controls">
			                <select name="ovpLink" id="ovpLink" class="input-xxlarge" size="1" onchange="chgLink(this);">
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
			                <input type="text" class="input-xlarge" name="userId" id="userId" value="Narash">
			            </div>
			        </div>
			        <div class="control-group">
			            <label class="control-label" for="soldTo">Sold To</label>
			            <div class="controls">
			                <input type="text" class="input-xlarge" name="soldTo" id="soldTo" value="" onblur="procMsg(this, 2);" placeHolder="Not WebUI, value needed"/>&nbsp;<span id="msg2" style="color: red;display: none;">Please enter soldTo when request system is not webUI</span>
			            </div>
			        </div>
			        <div class="control-group">
			            <label class="control-label" for="cipher">Cipher</label>
			            <div class="controls">
			                <input type="text" class="input-xlarge" name="cipher" id="cipher" value="" placeHolder="Access Production, value needed"/>&nbsp;<span id="cpSpan" style="color: red;display: none;">Access to the production environment, Please enter cipher</span>
			            </div>
			        </div>
			        <div class="control-group">
			            <label class="control-label" for="reqSys">RequestorSystem</label>
			            <div class="controls">
			                <select name="reqSys" class="input-xlarge" id="reqSys">
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
			            <label class="control-label" for="nodeLevel">Node Level</label>
			            <div class="controls">
			                <select name="nodeLevel" class="input-xlarge" id="nodeLevel">
					           <option value="INTERNAL">Internal</option>
					           <option value="CHANNEL">Channel</option>
					           <option value="LE">LE</option>
					        </select>
			            </div>
			        </div>
			        <p>&nbsp;&nbsp;&nbsp;<i id="more-ico" class="icon-plus-sign"></i>&nbsp;&nbsp;&nbsp;<b>More</b></p>
			        <div id="more-info" class="more-info">
			        	<div class="control-group">
			            <label class="control-label" for="dateFormat">Date Format</label>
			            <div class="controls">
			                <select name="dateFormat" class="input-xlarge" id="dateFormat">
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
			                <select name="language" class="input-xlarge" id="language">
					            <option value="en" selected >
									English
								</option>
								<option value="ja" >
									日本語
								</option>
								<option value="ru" >
									русский
								</option>
								<option value="tr" >
									Türkçe
								</option>
								<option value="ar" >
									العربية
								</option>
								<option value="fr_CA" >
									Français canadien
								</option>
								<option value="fr_FR" >
									Français
								</option>
								<option value="zf" >
									繁體中文
								</option>
								<option value="ko" >
									한국어
								</option>
								<option value="es_LA" >
									Español Latinoamérica
								</option>
								<option value="es_ES" >
									Español
								</option>
								<option value="pt_BR" >
									Português do Brasil
								</option>
								<option value="pt_PT" >
									Português
								</option>
								<option value="de" >
									Deutsch
								</option>
								<option value="iw" >
									עברית
								</option>
								<option value="da" >
									Dansk
								</option>
								<option value="fi" >
									suomi
								</option>
								<option value="it" >
									Italiano
								</option>
								<option value="nl" >
									Nederlands
								</option>
								<option value="no" >
									Norsk
								</option>
								<option value="sv" >
									Svenska
								</option>	
					 
					       </select>
			            </div>
			        </div>
			        
			        <div class="control-group">
			            <label class="control-label" for="userEmail">User Email</label>
			            <div class="controls">
			                <input type="text" class="input-xlarge" name="userEmail" id="userEmail" value="sunning2@lenovo.com">
			            </div>
			        </div>
			        
			        <div class="control-group">
			            <label class="control-label" for="currencyDecimal">Currency Decimal</label>
			            <div class="controls">
			                <input type="text" class="input-xlarge" id="currencyDecimal" value="dot" readonly="readonly">
			            </div>
			        </div>
			        <div class="control-group">
			            <label class="control-label" for="country">Country</label>
			            <div class="controls">
							<input type="text" class="input-xlarge" id="country" name="country" value="US"/>
			            </div>
			        </div>
			        <div id="first-name" class="control-group">
			            <label class="control-label" for="firstName">First Name</label>
			            <div class="controls">
							<input type="text" class="input-xlarge" id="firstName" name="firstName" value="Ning"/>
			            </div>
			        </div>
			        <div id="last-name" class="control-group">
			            <label class="control-label" for="lastName">Last Name</label>
			            <div class="controls">
							<input type="text" class="input-xlarge" id="lastName" name="lastName" value="Sun"/>
			            </div>
			        </div>
			        <div id="time-zone" class="control-group">
			            <label class="control-label" for="timeZone">Time Zone</label>
			            <div class="controls">
							<select name="timeZone" class="input-xxlarge" id="timeZone" class="selec_bo">
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
			        </div>
			        <div class="control-group">
					    <div class="controls">
					      
					      <input type="button" id="login-ovp" class="btn btn-success" value="Login"/>
					    </div>
					</div>
			        
			       
		  	    </form>
		  
		  <div class="row-fluid">
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
				
		       </div>
		      </div> 
		  </div>
  	  </div>
  	  
  	  <!-- page js file  -->
  	  <script src="${ctx}/public/javascripts/app/index.js"></script>
  </body>
</html>
