package com.soar.ax.action.test;

public class OrdersController{
	
}
/**
import java.util.Collection;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Validateable;
import com.opensymphony.xwork2.ValidationAwareSupport;
import com.soar.ax.entity.informit.Order;
import com.soar.ax.service.other.OrdersService;
     
@Results({
    @Result(name="success", type="redirectAction", params = {"actionName" , "orders"})
})
public class OrdersController extends ValidationAwareSupport implements ModelDriven<Object>, Validateable{
 
	private static final long serialVersionUID = 7444503081464408690L;
	
	private Order model = new Order();
    private long id;
    private Collection<Order> list;
    
    @Autowired
    private OrdersService ordersService;
    
   
    // GET /orders/1
    public HttpHeaders show() {
        return new DefaultHttpHeaders("show");
    }

    // GET /orders
    public HttpHeaders index() {
        list = ordersService.getAll(Order.class);
        return new DefaultHttpHeaders("index")
            .disableCaching();
    }
    
    // GET /orders/1/edit
    public String edit() {
        return "edit";
    }

    // GET /orders/new
    public String editNew() {
        model = new Order();
        return "editNew";
    }

    // GET /orders/1/deleteConfirm
    public String deleteConfirm() {
        return "deleteConfirm";
    }

    // DELETE /orders/1
    public String destroy() {
        ordersService.delete(model);
        addActionMessage("Order removed successfully");
        return "success";
    }

    // POST /orders
    public HttpHeaders create() {
        ordersService.save(model);
        addActionMessage("New order created successfully");
        return new DefaultHttpHeaders("success")
            .setLocationId(model.getId());
    }

    // PUT /orders/1
    public String update() {
        ordersService.saveOrUpdate(model);
        addActionMessage("Order updated successfully");
        return "success";
    }

    public void validate() {
        if (model.getClientName() == null || model.getClientName().length() ==0) {
            addFieldError("clientName", "The client name is empty");
        }
    }     

    public void setId(long id) {
        if (id != 0) {
            this.model = ordersService.getEntityById(Order.class, id);
        }
        this.id = id;
    }
    
    public Object getModel() {
        return (list != null ? list : model);
    }
}
**/