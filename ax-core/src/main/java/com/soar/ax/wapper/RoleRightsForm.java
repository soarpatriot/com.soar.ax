/**
 * 
 */
package com.soar.ax.wapper;

import java.util.ArrayList;
import java.util.List;

import com.soar.ax.entity.authrization.Right;
import com.soar.ax.entity.authrization.Role;

/**
 * @author liuhb7
 *
 */
public class RoleRightsForm {
	
	private Role role;
	
	private List<Right> rights;
	
	private List<Long> roleRights;

	
	public List<Long> obtainRightsId(List<Right> rights){
		
		List<Long> roleRights = new ArrayList<Long>();
		for(Right r : rights){
			roleRights.add(r.getId());
		}
		return roleRights;
	}
	
	public void fillRoleRights(List<Right> rights){
		setRoleRights(obtainRightsId(rights));
	}
	
	public List<Right> obtainRights(List<Long> roleRights){
		
		List<Right> rights = new ArrayList<Right>();
		
		for(Long rightIdValue : roleRights){
			Right r = new Right();
			r.setId(rightIdValue);
			rights.add(r);
		}
		
		return rights;
	}
	
	/*public List<Right> obtainDelete(List<Right> rights){
		rights.
		return null;
	}
	*/
	
	public List<Right> getRights() {
		return rights;
	}

	public void setRights(List<Right> rights) {
		this.rights = rights;
	}

	

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Long> getRoleRights() {
		return roleRights;
	}

	public void setRoleRights(List<Long> roleRights) {
		this.roleRights = roleRights;
	}
	
	
}
