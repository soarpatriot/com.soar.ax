/**
 * Copyright (c) 2011, Lenovo Group, Ltd. All rights reserved.
 */
package com.soar.ax.controller.manage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.soar.ax.controller.BaseController;
import com.soar.ax.entity.authrization.RightSpace;
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
@RequestMapping("/right-space")
public class RightSpaceController extends BaseController{
	
	    @Autowired
		private RightSpaceService rightSpaceService;

	    @RequestMapping(method = RequestMethod.GET)
	    public ModelAndView index() {
	    	
	        ModelAndView mav = new ModelAndView();
			mav.setViewName("right-space/right-space-index");
			List<RightSpace> rightSpaces = rightSpaceService.find("from RightSpace");
			mav.addObject("rightSpaces", rightSpaces);
			return mav;
	    }
	    
	    @RequestMapping(value = "/new", method = RequestMethod.GET)
		public ModelAndView initNew(){
	    	RightSpace rightSpace = new RightSpace();
	    	ModelAndView mav = new ModelAndView();
			mav.setViewName("right-space/right-space-new");
			mav.addObject("rightSpace", rightSpace);
			
			return mav;
		}
	    
	    @RequestMapping(method = RequestMethod.POST)
		public String create(@ModelAttribute("rightSpace") RightSpace rightSpace,RedirectAttributes redirectAttrse) {
	        String message = "Save right space successfully";
	    	ModelAndView mav = new ModelAndView();
	    	redirectAttrse.addFlashAttribute("message", message);
			mav.setViewName("right-space/right-space-index");
			rightSpaceService.save(rightSpace);
			return "redirect:/right-space";
		}
	    
	    @RequestMapping(value = "/{id}/edit",method = RequestMethod.GET)
		public String edit(@PathVariable long id,Model model) {
	    	
	    	RightSpace rightSpace = rightSpaceService.getEntityById(RightSpace.class, id);
			//mav.setViewName("right-space/right-space-edit");
	    	model.addAttribute("rightSpace", rightSpace);
			return "right-space/right-space-edit";
		}
	    
	    @RequestMapping(method = RequestMethod.PUT)
		public String update(@ModelAttribute("rightSpace") RightSpace rightSpace,RedirectAttributes redirectAttrse) {
	    	String message = "update right space successfully";
	    	rightSpaceService.saveOrUpdate(rightSpace);
	    	redirectAttrse.addFlashAttribute("message", message);
			return "redirect:/right-space";
		}
	    
	    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
		public String remove(@PathVariable long id, RedirectAttributes redirectAttrse) {
	    	String message = "delete right space successfully";
	    	RightSpace rightSpace = new RightSpace();
	    	rightSpace.setId(id);
	    	rightSpaceService.delete(rightSpace);
	    	redirectAttrse.addFlashAttribute("message", message);
			return "redirect:/right-space";
		}
}
