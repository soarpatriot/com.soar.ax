/**
 * 
 */
package com.soar.ax.entity.issue;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.soar.ax.entity.IdEntity;

/**
 * @author liuhb7
 *
 */
@Entity
@Table(name="AX_WORK_CONTENT")
public class WorkContent extends IdEntity{
	
	
	private String workDescription;
	private Date beginTime;
	private Date endTime;
	private String itemStatus;
	
	
	public String getWorkDescription() {
		return workDescription;
	}
	public void setWorkDescription(String workDescription) {
		this.workDescription = workDescription;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
}
