/**
 * 
 */
package com.soar.ax.entity.ovp;

import java.util.List;

/**
 * @author liuhb7
 *
 */
public class LineItem {
	
	private String productid;
	private String listprice;
	private List<Delivery> deliveries;
	
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getListprice() {
		return listprice;
	}
	public void setListprice(String listprice) {
		this.listprice = listprice;
	}
	public List<Delivery> getDeliveries() {
		return deliveries;
	}
	public void setDeliveries(List<Delivery> deliveries) {
		this.deliveries = deliveries;
	}
}
