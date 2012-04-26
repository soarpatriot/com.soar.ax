/**
 * 
 */
package com.soar.ax.entity.authrization;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.soar.ax.entity.IdEntity;

/**
 * @author liuhb7
 *
 */
@Entity
@Table(name="AX_RIGHT")
public class Right extends IdEntity {
	
	/*name space for right*/
	private String rightSpace;
	/*right type like ,menu,button,link*/
	private String rightSpaceDescription;
	
	private String rightType;
	/* below right type,right id */
	private String rightId;
	
	private String rightDescription;
	
	private boolean hasRight;
	
	@ManyToMany(
			cascade = {CascadeType.PERSIST, CascadeType.MERGE},
			mappedBy = "rights",
			targetEntity = Role.class
	)
	@Fetch(FetchMode.SUBSELECT) 
	private Set<Role> roles;
	
	@OneToOne
	@JoinColumn(name="SECURITY_RESOURCE_ID")
	private SecurityResource securityResource;
	
	public String getRightSpace() {
		return rightSpace;
	}
	public void setRightSpace(String rightSpace) {
		this.rightSpace = rightSpace;
	}
	public String getRightType() {
		return rightType;
	}
	public void setRightType(String rightType) {
		this.rightType = rightType;
	}
	public String getRightId() {
		return rightId;
	}
	public void setRightId(String rightId) {
		this.rightId = rightId;
	}
	public boolean isHasRight() {
		return hasRight;
	}
	public void setHasRight(boolean hasRight) {
		this.hasRight = hasRight;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public SecurityResource getSecurityResource() {
		return securityResource;
	}
	public void setSecurityResource(SecurityResource securityResource) {
		this.securityResource = securityResource;
	}
	public String getRightSpaceDescription() {
		return rightSpaceDescription;
	}
	public void setRightSpaceDescription(String rightSpaceDescription) {
		this.rightSpaceDescription = rightSpaceDescription;
	}
	public String getRightDescription() {
		return rightDescription;
	}
	public void setRightDescription(String rightDescription) {
		this.rightDescription = rightDescription;
	}

}
