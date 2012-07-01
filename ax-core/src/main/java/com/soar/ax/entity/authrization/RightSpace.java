package com.soar.ax.entity.authrization;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
@Table(name="AX_RIGHT_SPACE")
public class RightSpace extends IdEntity {
	
	private String name;
	private String code;
	private String description;
	
	@OneToMany(
			targetEntity = User.class
	)
	@Fetch(FetchMode.SUBSELECT) 
	private List<Right> rights;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Right> getRights() {
		return rights;
	}
	public void setRights(List<Right> rights) {
		this.rights = rights;
	}
}