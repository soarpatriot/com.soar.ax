/**
 * 
 */
package com.soar.ax.entity.authrization;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author liuhb7
 *
 */

public class UserRole{
	
	/*@EmbeddedId*/
	private UserRolePrimaryKey primaryKey;
	
	/*@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity=User.class)
	@JoinColumn(name="user_id")*/
	private User user;
	/*@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity=User.class)
	@JoinColumn(name="role_id")*/
	private Role role;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public UserRolePrimaryKey getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(UserRolePrimaryKey primaryKey) {
		this.primaryKey = primaryKey;
	}
}
