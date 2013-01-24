/**
 * 
 */
package com.soar.ax.entity.ovp;

import java.util.List;

/**
 * @author liuhb7
 *
 */
public class OrderPage {
	private long total;
	private List<LineItem> rows;
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<LineItem> getRows() {
		return rows;
	}
	public void setRows(List<LineItem> rows) {
		this.rows = rows;
	}
}
