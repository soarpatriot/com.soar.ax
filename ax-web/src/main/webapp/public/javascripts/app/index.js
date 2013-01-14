$(function() { 
  	  	      
  	$("select").select2(); 
    $('#about').avgrund({
		height: 200,
		holderClass: 'custom',
		showClose: true,
		showCloseText: 'Close',
		enableStackAnimation: true,
		onBlurContainer: '.container',
		template: '<p>OVP client 1.7.5        Build For OVP</p>' +
		'<p>' +
		'<a class="btn btn-primary" href="https://github.com/soarpatriot/com.soar.ax/tree/OVP" target="_blank" class="github">OVP client on Github</a>' +
		
		'</p>'
	});
	  
	$("#more-ico").toggle(function(){
	           
		 $("#more-info").show("slow"); 
         $(this).attr("class","icon-minus-sign");
       			},function(){ 
       	 $("#more-info").hide("slow"); 
       	 $(this).attr("class","icon-plus-sign");
	 }); 
	  
	 String.prototype.trim = function (){
   	      return this.replace(/(^\s*)|(\s*$)/g , '');
	 }
	 $("#login-ovp").click(function(){
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
			
	 });
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
});