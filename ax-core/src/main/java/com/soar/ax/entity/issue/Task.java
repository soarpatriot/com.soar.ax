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
@Table(name="AX_TASK")
public class Task extends IdEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -838446832130356854L;
	
	private String title;
	private String detail;
	private String followAction;
	private String owner;
	private String executor;
	private Date targetDate;
	private String status;
	private Date updateDate;
	private String priority;
	private String belongToWave;
	private String defectId;
	private int manDay;
	
	public int getManDay() {
		return manDay;
	}
	public void setManDay(int manDay) {
		this.manDay = manDay;
	}
	public String getDefectId() {
		return defectId;
	}
	public void setDefectId(String defectId) {
		this.defectId = defectId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getFollowAction() {
		return followAction;
	}
	public void setFollowAction(String followAction) {
		this.followAction = followAction;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getBelongToWave() {
		return belongToWave;
	}
	public void setBelongToWave(String belongToWave) {
		this.belongToWave = belongToWave;
	}
	public String getExecutor() {
		return executor;
	}
	public void setExecutor(String executor) {
		this.executor = executor;
	}
}
