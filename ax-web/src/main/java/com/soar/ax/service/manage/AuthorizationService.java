/**
 * 
 */
package com.soar.ax.service.manage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.soar.ax.entity.authrization.Right;
import com.soar.ax.entity.authrization.Role;
import com.soar.ax.service.BaseService;

/**
 * @author liuhb7
 *
 */
@Service("authorizationService")
public class AuthorizationService extends BaseService{
	
	public void updateRoleRights(long roleId,List<Long> rightIds){
		Role role = (Role)getEntityById(Role.class, roleId);
		//deleteAll(role.getRights());
		
		List<Right> rights = new ArrayList<Right>();
		
		Right right = new Right();
		
		if(null != rightIds){
			for(Long rightId : rightIds){
				
				right = (Right)getEntityById(Right.class, rightId);
				
				rights.add(right);
			}
		}
        if(null == rights || rights.isEmpty()){
        	role.setRights(null);
        }else{
    		role.setRights(rights);

        }
		saveOrUpdate(role);
	}
}
