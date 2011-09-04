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
@Entity
@Table(name="AX_USER_ROLE")
public class UserRole extends IdEntity{
	
	@ManyToOne
	private User user;
	@ManyToOne
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
}
