package com.soar.ax.entity.informit;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.soar.ax.entity.IdEntity;


@Entity
@Table(name="AX_ORDER")
public class Order extends IdEntity{
	
	
	private String clientName;
	int amount;
	    
	public Order() {}
    
  
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
   
   
}
