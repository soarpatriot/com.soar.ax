/**
 * 
 */
package com.soar.ax.wapper;

import java.util.List;

import com.soar.ax.entity.authrization.Role;

/**
 * @author liuhb7
 *
 */
public class UserRolesWapper {
	
	private long userId;
	private String existInUser;
	private long[] roleIds;
	private Role role;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long[] getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(long[] roleIds) {
		this.roleIds = roleIds;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getExistInUser() {
		return existInUser;
	}
	public void setExistInUser(String existInUser) {
		this.existInUser = existInUser;
	}
	
}
