/**
 * 
 */
package com.soar.ax.controller;

import java.beans.PropertyEditor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.SessionAttributes;


/**
 * @author liuhb7
 *
 */
@Controller

public class BaseController {
	
	protected String nameSpace = "";
	
	protected String hightLight = "";
	
	
	public BaseController(){
		hightLight = "";
	}
	
	@InitBinder
    protected void initBinder(WebDataBinder binder) {
    	DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	PropertyEditor p = new CustomDateEditor(df,true);
    	binder.registerCustomEditor(Date.class, p);
    }

	public String getNameSpace() {
		return nameSpace;
	}

	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
	}

	public String getHightLight() {
		return hightLight;
	}

	public void setHightLight(String hightLight) {
		this.hightLight = hightLight;
	}

	
}
