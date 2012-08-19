package com.soar.ax.entity.authrization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.security.core.GrantedAuthority;

import com.soar.ax.entity.IdEntity;
import com.soar.ax.wapper.MyGrantedAuthority;


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
    
	private String username;
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
	@Fetch(FetchMode.SUBSELECT) 
	private Set<Role> roles;
	
	
	public User()
	{
		
	}
	
	public Collection<GrantedAuthority> getAuthorities(){
		Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
		if(null != this.getRoles() && !this.getRoles().isEmpty()){
			for(Role r : this.getRoles()){
				if(null != r.getRights() && !r.getRights().isEmpty()){
					for(Right right:r.getRights()){
						MyGrantedAuthority ga = new MyGrantedAuthority();
						String rightId = String.valueOf(right.getId());
						
						ga.setRightId(rightId);
						auths.add(ga);
					}
				}
			}
		}else{
			return null;
		}
		
	    
	    return auths;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}