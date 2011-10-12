/**
 * 
 */
package com.soar.ax.entity.authrization;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.soar.ax.entity.IdEntity;

/**
 * @author liuhb7
 *
 */

public class RoleRight extends IdEntity{
	
	
	private Role role;
	
	private Right right;
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Right getRight() {
		return right;
	}
	public void setRight(Right right) {
		this.right = right;
	}
}
