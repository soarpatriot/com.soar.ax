/**
 * 
 */
package com.soar.ax.entity.authrization;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
	@Fetch(FetchMode.SUBSELECT) 
	private Set<User> users;
	
	@ManyToMany(targetEntity=Right.class,
			cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
		name="AX_ROLE_RIGHT",
		joinColumns=@JoinColumn(name="ROLE_ID"),
		inverseJoinColumns=@JoinColumn(name="RIGHT_ID")
	)
	@Fetch(FetchMode.SUBSELECT) 
	private List<Right> rights;
	
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
	public List<Right> getRights() {
		return rights;
	}
	public void setRights(List<Right> rights) {
		this.rights = rights;
	}
	
}
