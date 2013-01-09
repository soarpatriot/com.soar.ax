package com.soar.ax.service.ovp;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.soar.ax.base.BaseTest;
import com.soar.ax.entity.ovp.SalesOrder;

public class OrderServiceTest extends BaseTest{
	
	@Autowired
	private OrderService orderService;

	
	@Test
	public void findOrderByDMUpdateStartAndEnd(){
		findOrdersByUpdateDMTime();
	}
	
	@Test
	public void removeFromMongoByOrderNumber(){
        List<SalesOrder> orders = null;
        SalesOrder order = new SalesOrder();
		
        orders = findOrdersByUpdateDMTime();
        order = orders.get(0);
		//test find and removeorders
		Assert.assertNotNull(order.getSalesOrderNumber());
		orderService.saveToMongo(order);
		Query query = new Query(Criteria.where("salesOrderNumber").is(order.getSalesOrderNumber()));
		List<SalesOrder> sales = orderService.getObjFromMongo(query, SalesOrder.class);
		Assert.assertNotNull(sales);
		
		if(!(sales.size()>0)){
			Assert.fail("orders is empty");
		}
		Assert.assertEquals(1, sales.size());
		orderService.removeFromMongoByOrderNumber(order.getSalesOrderNumber());
		List<SalesOrder> afterDeleteList = orderService.getObjFromMongo(query, SalesOrder.class);
		Assert.assertNotNull(afterDeleteList);
		Assert.assertEquals(0, afterDeleteList.size());
		
	}
	
	/**
	 * provided the test data
	 * @return
	 */
	private List<SalesOrder> findOrdersByUpdateDMTime(){
		List<SalesOrder> orders = null;
		try{
			Date start = new Date();
			Date end = new Date();
			Calendar startCal = Calendar.getInstance();
			startCal.set(2012, 4, 5);
			start = startCal.getTime();
			startCal.set(2012, 4, 15);
			end = startCal.getTime();
			
			orders = orderService.findOrderByDMUpdateStartAndEnd(start, end);
		}catch(Exception e){
			e.printStackTrace();
			Assert.fail("order service findOrderByStartAndEnd test failed");
		}
		Assert.assertNotNull(orders);
		if(!(orders.size()>0)){
			Assert.fail("orders is empty");
		}
		return orders;
	}
	
	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	
	
}
