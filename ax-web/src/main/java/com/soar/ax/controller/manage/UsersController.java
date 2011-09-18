/**
 * Copyright (c) 2011, Lenovo Group, Ltd. All rights reserved.
 */
package com.soar.ax.controller.manage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.soar.ax.entity.authrization.User;
import com.soar.ax.service.manage.UsersService;

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
@RequestMapping("/users")
public class UsersController {
	
	    @Autowired
		private UsersService usersService;

	    @RequestMapping(method = RequestMethod.GET)
	    public ModelAndView index() {
	    	
	    	ModelAndView mav = new ModelAndView();
			mav.setViewName("user/user-index");
			List<User> users = usersService.find("from User");
			mav.addObject("templete", "template");
			mav.addObject("users", users);
			return mav;
	    }
	    @RequestMapping(value = "/new", method = RequestMethod.GET)
		public ModelAndView initNew() {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/user/user-new");
			User user = new User();
			mav.addObject("user", user);
			return mav;
		
		}
	    
	    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public ModelAndView show(@PathVariable long id) {
			ModelAndView mav = new ModelAndView();
			List<User> users = usersService.find("from User u where u.id="+id);
			if(null!=users && users.size()>0){
				mav.addObject("user", users.get(0));
			}
			mav.setViewName("user/user-show");
			return mav;
		}
	    
	    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
		public ModelAndView edit(@PathVariable long id) {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/user/user-edit");
			User user = usersService.getEntityById(User.class, id);
			mav.addObject("user", user);
			return mav;
		
		}
	    
	    @RequestMapping( method = RequestMethod.PUT)
		public ModelAndView update(@ModelAttribute("user") User user) {
			
	    	ModelAndView mav = new ModelAndView();
			mav.setViewName("/user/user-show");
			usersService.saveOrUpdate(user);
			mav.addObject("user", user);
			return mav;
		}
	    
	    
	    
	    @RequestMapping(method = RequestMethod.POST)
		public ModelAndView create(@ModelAttribute("user") User user) {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/user/user-show");
			usersService.save(user);
			mav.addObject("user", user);
			return mav;
		
		}
	    
	    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
		public String remove(@PathVariable long id) {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/s3/users");
			User user = new User();
			user.setId(id);
			usersService.delete(user);
			
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
	    
	
		public UsersService getUsersService() {
			return usersService;
		}

		public void setUsersService(UsersService usersService) {
			this.usersService = usersService;
		}
}
