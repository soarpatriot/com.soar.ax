/**
 * 
 */
package com.soar.ax.entity.authrization;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author liuhb7
 *
 */
@Embeddable
public class UserRolePrimaryKey implements Serializable{
	
	@Column(name = "USER_ID")
	private long userId;
	@Column(name = "ROLE_ID")
	private long roleId;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
}
