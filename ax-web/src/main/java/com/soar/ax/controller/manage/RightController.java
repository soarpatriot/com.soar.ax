/**
 * Copyright (c) 2011, Lenovo Group, Ltd. All rights reserved.
 */
package com.soar.ax.controller.manage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.soar.ax.entity.authrization.Right;
import com.soar.ax.entity.authrization.RightSpace;
import com.soar.ax.service.manage.RightService;
import com.soar.ax.service.manage.RightSpaceService;

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
@RequestMapping("/right")
public class RightController {
	
	    @Autowired
		private RightService rightService;
	    
	    @Autowired
		private RightSpaceService rightSpaceService;

	    @RequestMapping(method = RequestMethod.GET)
	    public ModelAndView list() {
	    	
	        ModelAndView mav = new ModelAndView();
			mav.setViewName("right/right-index");
			List<Right> rights = rightService.find("from Right");
			mav.addObject("rights", rights);
			return mav;
	    }
	    
	    @RequestMapping(value = "/new", method = RequestMethod.GET)
		public String initNew(Model model) {
	    	Right right = new Right();
	    	RightSpace rightSpace = new RightSpace();
	    	right.setRightSpace(rightSpace);
	    	
	    	List<RightSpace> rightSapces = rightSpaceService.getAll(RightSpace.class);
			
			model.addAttribute("right", right);
			model.addAttribute("rightSpaces", rightSapces);
			
			model.addAttribute("right11", "dddd");
			return "right/right-new";
		}

	    @RequestMapping(method = RequestMethod.POST)
		public String create(@ModelAttribute("right") Right right,RedirectAttributes redirectAttrse) {
	    	
	    	rightService.save(right);
	    	redirectAttrse.addAttribute("message", "Save right success!");
			return "redirect:/right";
		}
		public RightService getRightService() {
			return rightService;
		}

		public void setRightService(RightService rightService) {
			this.rightService = rightService;
		}

		public RightSpaceService getRightSpaceService() {
			return rightSpaceService;
		}

		public void setRightSpaceService(RightSpaceService rightSpaceService) {
			this.rightSpaceService = rightSpaceService;
		}
}
