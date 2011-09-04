/**
 * 
 */
package com.soar.ax.entity.authrization;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.soar.ax.entity.IdEntity;

/**
 * @author liuhb7
 *
 */
@Entity
@Table(name="AX_ROLE")
public class Role extends IdEntity{
	
	private String roleName;
	private String roleCode;
	
	@OneToMany
	private Set<RoleRight> roleRights;
	@OneToMany
	private Set<UserRole> userRoles;
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public Set<RoleRight> getRoleRights() {
		return roleRights;
	}
	public void setRoleRights(Set<RoleRight> roleRights) {
		this.roleRights = roleRights;
	}
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	
}
