/**
 * 
 */
package com.soar.ax.entity.authrization;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.soar.ax.entity.IdEntity;

/**
 * @author liuhb7
 *
 */
@Entity
@Table(name="AX_ROLE")
public class Role extends IdEntity{
	
	protected String roleName;
	protected String roleCode;
	
	@ManyToMany(
			cascade = {CascadeType.PERSIST, CascadeType.MERGE},
			mappedBy = "roles",
			targetEntity = User.class
	)
	private Set<User> users;
	
	@ManyToMany(targetEntity=Role.class,
			cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
		name="AX_ROLE_RIGHT",
		joinColumns=@JoinColumn(name="ROLE_ID"),
		inverseJoinColumns=@JoinColumn(name="RIGHT_ID")
	)
	private Set<Right> rights;
	
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
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Set<Right> getRights() {
		return rights;
	}
	public void setRights(Set<Right> rights) {
		this.rights = rights;
	}
	
}
