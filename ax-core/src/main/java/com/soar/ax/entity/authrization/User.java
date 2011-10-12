package com.soar.ax.entity.authrization;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.soar.ax.entity.IdEntity;

/**
 * 
 * 
 * 
 * 
 * 
 * @author soar
 */
@Entity
@Table(name="AX_USER")
public class User extends IdEntity {

	private String loginName;
	private String password;
	private String name;
	private String email;
	
	@ManyToMany(targetEntity=Role.class,
			cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
		name="AX_USER_ROLE",
		joinColumns=@JoinColumn(name="USER_ID"),
		inverseJoinColumns=@JoinColumn(name="ROLE_ID")
	)
	private Set<Role> roles;
	
	
	public User()
	{
		
	}
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}