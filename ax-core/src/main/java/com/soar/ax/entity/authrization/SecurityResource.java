/**
 * 
 */
package com.soar.ax.entity.authrization;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.soar.ax.entity.IdEntity;

/**
 * @author liuhb7
 *
 */
@Entity
@Table(name="AX_SECURITY_RESOURCE")
public class SecurityResource extends IdEntity{
	/*name space for right*/
	private String nameSpace;
	/*right type like ,menu,button,link*/
	private String resourceType;
	/* below right type,right id */ 
	private String description;
	
	private String resourceIdentity;
	
	@OneToOne
	@JoinColumn(name="RIGHT_ID")
	private Right right;
	
	public String getNameSpace() {
		return nameSpace;
	}
	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Right getRight() {
		return right;
	}
	public void setRight(Right right) {
		this.right = right;
	}
	public String getResourceIdentity() {
		return resourceIdentity;
	}
	public void setResourceIdentity(String resourceIdentity) {
		this.resourceIdentity = resourceIdentity;
	}
}
