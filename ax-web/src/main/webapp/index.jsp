<%@ page language="java" pageEncoding="UTF-8"%>
<div class="page">
	<form class="well form-horizontal">
		<legend>Access OVP</legend>
		<div id="userid-group" class="control-group">
            <label class="control-label" for="userId">User Id</label>
            <div class="controls">
                <input type="text" name="userId" id="userId" value="Narash">
            </div>
        </div>
        <div id="soldto-group" class="control-group">
            <label class="control-label" for="soldTo">Sold To</label>
            <div class="controls">
                <input type="text" name="soldTo" id="soldTo">
            </div>
        </div>
        <div id="cipher-group" class="control-group">
            <label class="control-label" for="Cipher">Cipher</label>
            <div class="controls">
                <input type="text" name="cipher" id="cipher">
            </div>
        </div>
        <div id="reqSys-group" class="control-group">
            <label class="control-label" for="reqSys">Requestor System</label>
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
        <div id="nodeLevel-group" class="control-group">
            <label class="control-label" for="nodeLevel">Node Level</label>
            <div class="controls">
                <select name="nodeLevel" id="nodeLevel">
			           <option value="INTERNAL">Internal</option>
			           <option value="CHANNEL">Channel</option>
			           <option value="LE">LE</option>
		         </select>
            </div>
        </div>
        <div id="userEmail-group" class="control-group">
            <label class="control-label" for="userEmail">User Email</label>
            <div class="controls">
     			 <input type="text" name="userEmail" id="userEmail">
            </div>
        </div>
        <div id="dateformat-group" class="control-group">
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
        <div id="language-group" class="control-group">
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
        <div id="currency-group" class="control-group">
            <label class="control-label" for="currencyDecimal">Currency Decimal</label>
            <div class="controls">
                <input type="text" id="currencyDecimal" value="dot" readonly="readonly">
            </div>
        </div>
        <div id="country-group" class="control-group">
            <label class="control-label" for="Country">Country</label>
            <div class="controls">
                <input id="country" name="country" value="US"/>
            </div>
        </div>
        
       
        <div id="first-group" class="control-group">
            <label class="control-label" for="firstName">FirstName</label>
            <div class="controls">
                <input id="firstName" name="firstName" value="FirstName"/>
            </div>
        </div>
        <div id="last-group" class="control-group">
            <label class="control-label" for="lastName">LastName</label>
            <div class="controls">
                <input id="lastName" name="lastName" value="LastName"/>
            </div>
        </div>
        <div id="time-group" class="control-group">
            <label class="control-label" for="timeZone">Time Zone</label>
            <div class="controls">
               <select name="timeZone" id="timeZone">
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
        <div id="last-group" class="control-group">
            <label class="control-label" for="lastName"></label>
            <div class="controls">
                <input type="button" class="btn btn-primary btn-success" value="login">
            </div>
        </div>
	</form>
</div>