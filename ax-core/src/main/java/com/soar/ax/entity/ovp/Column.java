/**
 * 
 */
package com.soar.ax.entity.ovp;

/**
 * @author liuhb7
 *
 */
public class Column {
	//{field:'listprice',title:'List Price',width:80,align:'right',sortable:true},
	private String field;
	private String title;
	private int width;
	private String align;
	private boolean sortable;
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getAlign() {
		return align;
	}
	public void setAlign(String align) {
		this.align = align;
	}
	public boolean isSortable() {
		return sortable;
	}
	public void setSortable(boolean sortable) {
		this.sortable = sortable;
	}
}
