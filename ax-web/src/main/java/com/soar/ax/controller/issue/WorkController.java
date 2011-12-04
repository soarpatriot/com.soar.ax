/**
 * Copyright (c) 2011, Lenovo Group, Ltd. All rights reserved.
 */
package com.soar.ax.controller.issue;

import java.beans.PropertyEditor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.soar.ax.controller.BaseController;
import com.soar.ax.entity.authrization.User;
import com.soar.ax.entity.issue.WorkContent;
import com.soar.ax.service.issue.WorkService;

/**
 * <p>
 * 
 * <dl>
 * <dt><b>Examples:</b></dt>
 * <p>
 * <pre>
 * 
 * </pre>
 * 
 * <p><dt><b>Thread Safety:</b></dt> 
 * <dd>
 * 	<b>NOT-THREAD-SAFE</b> and <b>NOT-APPLICABLE</b> (for it will never be used on multi-thread occasion.)
 * </dd>
 * 
 * <p><dt><b>Serialization:</b></dt>
 * <dd>
 * 	<b>NOT-SERIALIIZABLE</b> and <b>NOT-APPLICABLE</b> (for it have no need to be serializable.)
 * </dd>
 * 
 * <p><dt><b>Design Patterns:</b></dt>
 * <dd>
 * 	
 * </dd>
 * 
 * <p><dt><b>Change History:</b></dt>
 * <dd>
 * 	Date		Author		Action
 * </dd>
 * <dd>
 * 	Apr 25, 2011	Soar	Create the class
 * </dd>
 * 
 * </dl>
 * @author	Soar
 * @see			
 * @see			
 */
@Controller
@RequestMapping("/work")
public class WorkController extends BaseController{
	
	    @Autowired
		private WorkService workService;
       
	    public WorkController(){
	    	nameSpace = "work";
	    }
	    @InitBinder
	    protected void initBinder(WebDataBinder binder) {
	    	
	    	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    	PropertyEditor p = new CustomDateEditor(df,true);
	    	binder.registerCustomEditor(Date.class, p);
	    	
	       
	    }
	    
	    @RequestMapping(method = RequestMethod.GET)
	    public ModelAndView index() {
	    	
	    	ModelAndView mav = new ModelAndView();
			mav.setViewName(nameSpace+"/work-index");
			List<WorkContent> workContents = workService.find("from WorkContent");
		
			mav.addObject("workContents", workContents);
			return mav;
	    }
	    @RequestMapping(value = "/new", method = RequestMethod.GET)
		public ModelAndView createNew() {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName(nameSpace+"/work-new");
			WorkContent workContent = new WorkContent();
			mav.addObject("workContent", workContent);
			return mav;
		
		}
	    
	    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public ModelAndView show(@PathVariable long id) {
			ModelAndView mav = new ModelAndView();
			/*List<User> users = usersService.find("from User u where u.id="+id);
			if(null!=users && users.size()>0){
				mav.addObject("user", users.get(0));
			}*/
			mav.setViewName("user/user-show");
			return mav;
		}
	    
	    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
		public ModelAndView edit(@PathVariable long id) {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName(nameSpace+"/work-edit");
			WorkContent workContent = workService.getEntityById(WorkContent.class, id);
			mav.addObject("workContent", workContent);
			return mav;
		
		}
	    
	    @RequestMapping( method = RequestMethod.PUT)
		public ModelAndView update(@ModelAttribute("user") User user) {
			
	    	ModelAndView mav = new ModelAndView();
			/*mav.setViewName("/user/user-show");
			usersService.saveOrUpdate(user);*/
			mav.addObject("user", user);
			return mav;
		}
	    
	    
	    
	    @RequestMapping(method = RequestMethod.POST)
		public String create(@ModelAttribute("workContent") WorkContent workContent) {
			
	    	workService.saveOrUpdate(workContent);
			return "redirect:/s3/work";
		}
	    
	    @RequestMapping(value = "/today",method = RequestMethod.GET)
		public ModelAndView today() {
			
	    	/*Date today = new Date();
	    	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    	String todayStr = df.format(today);*/
	    	ModelAndView mav = new ModelAndView();
			mav.setViewName(nameSpace+"/work-index");
			//String queryString = "from WorkContent w where "+todayStr+">w.beginTime  and w.endTime <"+todayStr;
			List<WorkContent> workContents = workService.findTodayWork();
		
			mav.addObject("workContents", workContents);
			return mav;
		}
	
		
}
