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

import com.soar.ax.entity.authrization.Role;
import com.soar.ax.entity.authrization.User;
import com.soar.ax.service.manage.RolesService;

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
@RequestMapping("/roles")
public class RolesController {
	
	    @Autowired
		private RolesService rolesService;

	    @RequestMapping(method = RequestMethod.GET)
	    public ModelAndView index() {
	    	
	    	ModelAndView mav = new ModelAndView();
			mav.setViewName("role/role-index");
			List<Role> roles = rolesService.find("from Role");
			mav.addObject("templete", "template");
			mav.addObject("roles", roles);
			return mav;
	    }
	    @RequestMapping(value = "/new", method = RequestMethod.GET)
		public ModelAndView initNew() {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/role/role-new");
			Role role = new Role();
			mav.addObject("role", role);
			return mav;
		
		}
	    
	    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public ModelAndView show(@PathVariable long id) {
			ModelAndView mav = new ModelAndView();
			List<Role> roles = rolesService.find("from Role u where u.id="+id);
			if(null!=roles && roles.size()>0){
				mav.addObject("role", roles.get(0));
			}
			mav.setViewName("role/role-show");
			return mav;
		}
	    
	    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
		public ModelAndView edit(@PathVariable long id) {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/role/role-edit");
			Role role = rolesService.getEntityById(Role.class, id);
			mav.addObject("role", role);
			return mav;
		
		}
	    
	    @RequestMapping( method = RequestMethod.PUT)
		public ModelAndView update(@ModelAttribute("role") Role role) {
			
	    	ModelAndView mav = new ModelAndView();
			mav.setViewName("/role/role-show");
			rolesService.saveOrUpdate(role);
			mav.addObject("role", role);
			return mav;
		}
	    
	    
	    
	    @RequestMapping(method = RequestMethod.POST)
		public ModelAndView create(@ModelAttribute("role") Role role) {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/role/role-show");
			rolesService.save(role);
			mav.addObject("role", role);
			return mav;
		
		}
	    
	    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
		public String remove(@PathVariable long id) {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/s3/role");
			Role role = new Role();
			role.setId(id);
			rolesService.delete(role);
			
			return "redirect:/s3/roles";
		}
	    
	   
	    
	    @RequestMapping(value = "/toOrders", method = RequestMethod.GET)
		public String testRe() {
			return "redirect:/test/orders";
		}
		public RolesService getRolesService() {
			return rolesService;
		}
		public void setRolesService(RolesService rolesService) {
			this.rolesService = rolesService;
		}
	    
	
}
