/**
 * 
 */
package com.soar.ax.controller.ovp;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soar.ax.controller.BaseController;
import com.soar.ax.entity.ovp.Column;
import com.soar.ax.entity.ovp.LineItem;
import com.soar.ax.entity.ovp.OrderPage;
import com.soar.ax.entity.ovp.OrderTestData;
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
	public String index(Model model) {
		List<Column> lineItemColumns = OrderTestData.lineItemColumn();
		String lineItem = JSONArray.fromObject(lineItemColumns).toString();
		
		List<Column> deliveryColumns = OrderTestData.deliveryColumn();
		String delivery = JSONArray.fromObject(deliveryColumns).toString();
		
		model.addAttribute("lineItem", lineItem);
		model.addAttribute("delivery", delivery);
		
		return "order/grid";
	}
	
	
	
	@RequestMapping(value = "/list",method = RequestMethod.POST)
	@ResponseBody
	public OrderPage list(Model model) {
		List<LineItem> lineItems = OrderTestData.itemData();
		OrderPage orderPage = new OrderPage();
		orderPage.setTotal(1);
		orderPage.setRows(lineItems);
		
		return orderPage;
	}
	
	
	
	

	
	
	/*@RequestMapping(method = RequestMethod.GET)
	public String create() {
		
		Person p = new Person("132213",20);
		
		orderService.saveToMongo(p);
		System.out.println("sdf");
		return "redirect:/right";
	
	}*/
}
