/**
 * 
 */
package com.soar.ax.controller.ovp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soar.ax.client.Person;
import com.soar.ax.controller.BaseController;
import com.soar.ax.service.ovp.OrderService;

/**
 * @author liuhb7
 *
 */
@Controller
@RequestMapping("/order")
public class OrderController extends BaseController{
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		
		return "order/grid";
	}
	
	/*@RequestMapping(method = RequestMethod.GET)
	public String create() {
		
		Person p = new Person("132213",20);
		
		orderService.saveToMongo(p);
		System.out.println("sdf");
		return "redirect:/right";
	
	}*/
}
