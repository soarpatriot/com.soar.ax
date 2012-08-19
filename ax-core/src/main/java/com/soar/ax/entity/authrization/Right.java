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
import javax.persistence.ManyToOne;
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
	
	
	
	private String rightType;
	/*below right type,right id */
	
	/*resource type like ,menu,button,link*/
	private String resourceType;
	
	private String rightDescription;
	
	private boolean hasRight;
	
	private String resourceIdentity;
	
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
	
	@ManyToOne
	@JoinColumn(name="RIGHT_SPACE_ID")
	private RightSpace rightSpace;
	
	
	public RightSpace getRightSpace() {
		return rightSpace;
	}
	public void setRightSpace(RightSpace rightSpace) {
		this.rightSpace = rightSpace;
	}
	public String getRightType() {
		return rightType;
	}
	public void setRightType(String rightType) {
		this.rightType = rightType;
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
	
	public String getRightDescription() {
		return rightDescription;
	}
	public void setRightDescription(String rightDescription) {
		this.rightDescription = rightDescription;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getResourceIdentity() {
		return resourceIdentity;
	}
	public void setResourceIdentity(String resourceIdentity) {
		this.resourceIdentity = resourceIdentity;
	}

}
