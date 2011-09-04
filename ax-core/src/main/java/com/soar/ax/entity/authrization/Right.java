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
@Table(name="AX_RIGHT")
public class Right extends IdEntity {
	
	private String rightSpace;
	private String rightType;
	private String rightId;
	private boolean hasRight;
	@OneToMany
	private Set<RoleRight> roleRights;
	
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
	public Set<RoleRight> getRoleRights() {
		return roleRights;
	}
	public void setRoleRights(Set<RoleRight> roleRights) {
		this.roleRights = roleRights;
	}
}
