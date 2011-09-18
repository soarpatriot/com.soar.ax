/**
 * Copyright (c) 2011, Lenovo Group, Ltd. All rights reserved.
 */
package com.soar.ax.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.soar.ax.base.BaseTest;
import com.soar.ax.entity.Order;


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
 * 	Apr 24, 2011	Soar	Create the class
 * </dd>
 * 
 * </dl>
 * @author	Soar
 * @see			
 * @see			
 */
public class OrderServiceTest extends BaseTest{
		
	    @Autowired
	    private OrdersService ordersService;
	    
	    
		@Test
		public void save(){
			try{
				Order o = makeAnotherOneOrder();
				ordersService.save(o);
				
			    List<Order> orders =ordersService.find("from Order o where o.clientName='baozhong89898' and o.amount=21312312");
			    Assert.assertNotNull(orders);
			    Assert.assertEquals(1, orders.size());   
			           
			    ordersService.delete(orders.get(0));
			}catch(Exception e)
			{
				e.printStackTrace();
				Assert.fail();
			}	
		}
		
	    @Test
	    public void delete(){
	    	try{
	    		Order o = makeAnotherOneOrder();
				ordersService.save(o);
				
				ordersService.delete(o);
				List<Order> orders =ordersService.find("from Order o where o.clientName='baozhong89898' and o.amount=21312312");
				//Assert.assertNull(orders);
				Assert.assertEquals(0, orders.size());
			}catch(Exception e)
			{
				e.printStackTrace();
				Assert.fail();
			}
	    }

	    @Test (timeout=3000)
	    public void find(){
	    	try{
	    		Order o = makeOneOrder();
				ordersService.save(o);
				
			    List<Order> orders =ordersService.find("from Order o where o.clientName='baozhong56565' and o.amount=21312312");
			    Assert.assertNotNull(orders);
			    Assert.assertEquals(1, orders.size());
			    ordersService.deleteAll(orders);
			}catch(Exception e)
			{
				e.printStackTrace();
				Assert.fail();
			}
	    }
	    
		private Order makeOneOrder(){
			Order o = new Order();
			o.setClientName("baozhong56565");
			o.setAmount(21312312);
			return o;
		}
		
		private Order makeAnotherOneOrder(){
			Order o = new Order();
			o.setClientName("baozhong89898");
			o.setAmount(21312312);
			return o;
		}
}
