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
import org.springframework.web.servlet.view.RedirectView;

import com.soar.ax.controller.BaseController;
import com.soar.ax.entity.authrization.User;
import com.soar.ax.entity.issue.Task;
import com.soar.ax.service.issue.TaskService;

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
@RequestMapping("/task")
public class TaskController extends BaseController{
	
	    @Autowired
		private TaskService taskService;
       
	    public TaskController(){
	    	nameSpace = "task";
	    }
	    
	    @RequestMapping(method = RequestMethod.GET)
	    public ModelAndView index() {
	    	
	    	ModelAndView mav = new ModelAndView();
			mav.setViewName(nameSpace+"/task-index");
			List<Task> tasks = taskService.find("from Task");
			
			mav.addObject("templete", "template");
			mav.addObject("tasks", tasks);
			return mav;
	    }
	    @RequestMapping(value = "/new", method = RequestMethod.GET)
		public ModelAndView createNew() {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName(nameSpace+"/task-new");
			Task task = new Task();
			mav.addObject("task", task);
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
			mav.setViewName("/user/user-edit");
			Task task = taskService.getEntityById(Task.class, id);
			mav.addObject("task", task);
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
		public String create(@ModelAttribute("task") Task task) {
			
			taskService.save(task);
			return "redirect:/s3/task";
		}
	    
	    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
		public String remove(@PathVariable long id) {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/s3/users");
			/*User user = new User();
			user.setId(id);
			usersService.delete(user);
			*/
			return "redirect:/spring/users";
		}
	    
	    @RequestMapping(value = "/orders", method = RequestMethod.GET)
		public ModelAndView reToOrders() {
			System.out.println("sss");
			RedirectView v = new RedirectView();
			v.setUrl("/ax-web/test/orders");
			ModelAndView mav = new ModelAndView();
			mav.setView(v);
			return mav;
		
		}
	    
	    @RequestMapping(value = "/toOrders", method = RequestMethod.GET)
		public String testRe() {
			return "redirect:/test/orders";
		}
	    
	
		
}
