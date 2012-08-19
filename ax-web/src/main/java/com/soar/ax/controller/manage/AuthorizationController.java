package com.soar.ax.controller.manage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.soar.ax.controller.BaseController;
import com.soar.ax.entity.authrization.Right;
import com.soar.ax.entity.authrization.Role;
import com.soar.ax.entity.authrization.User;
import com.soar.ax.service.manage.AuthorizationService;
import com.soar.ax.service.manage.RightService;
import com.soar.ax.service.manage.RolesService;
import com.soar.ax.service.manage.UsersService;
import com.soar.ax.wapper.RoleCheckWapper;
import com.soar.ax.wapper.RoleRightsForm;
import com.soar.ax.wapper.UserRolesWapper;

/**
 * @author liuhb7
 *
 */
@Controller
@RequestMapping("/authorization")
public class AuthorizationController extends BaseController{
	
	@Autowired
	private UsersService usersService;

	@Autowired
	private RolesService rolesService;
	
	@Autowired
	private RightService rightService;
	
	@Autowired
	private AuthorizationService authorizationService;
	
	public AuthorizationController(){
		nameSpace = "authorization";
	}
	
	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
    	
    	ModelAndView mav = new ModelAndView();
		mav.setViewName("authorization/authorize-index");
		List<User> users = usersService.getAll(User.class);
		mav.addObject("templete", "template");
		mav.addObject("users", users);
		return mav;
    }
	
	@RequestMapping(value = "/{userId}/user-roles",method = RequestMethod.GET)
	public ModelAndView userRoles(@PathVariable long userId){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("authorization/user-roles");
	
		List<Role> roles = rolesService.getAll(Role.class);
		User u = usersService.getEntityById(User.class, userId);
		Set<Role> tempRoles = u.getRoles();
		
		UserRolesWapper userRolesWapper = new UserRolesWapper();
		List<RoleCheckWapper> userRoles = new ArrayList<RoleCheckWapper>();
		
		//put the roles and checked the roles belongs to now User
		for(Role r : roles){
			RoleCheckWapper roleCheckWapper = new RoleCheckWapper();
			roleCheckWapper.setRole(r);
			
			for(Role tempRole : tempRoles){
				if(tempRole.getId() == r.getId()){
					roleCheckWapper.setChecked("true");
					break;
				}
			}
			userRoles.add(roleCheckWapper);
		}
		mav.addObject("userId", userId);
		mav.addObject("userRoles", userRoles);
		mav.addObject("userRolesWapper", userRolesWapper);
		return mav;
	}
	
	@RequestMapping(value = "/save-user-roles",method = RequestMethod.POST)
	public String saveUserRoles(@ModelAttribute("userRolesWapperer") UserRolesWapper userRolesWapper){
		
		User user = usersService.getEntityById(User.class, userRolesWapper.getUserId());
		
		
		Set<Role> roles = new HashSet<Role>();
		for(long roleId : userRolesWapper.getRoleIds()){
			Role r = new Role();
			r = rolesService.getEntityById(Role.class, roleId);
			
			roles.add(r);
		}
		user.setRoles(roles);
		usersService.saveOrUpdate(user);
		return "redirect:";
	}

	@RequestMapping(value = "/roles",method = RequestMethod.GET)
	public ModelAndView roleRights(){
		List<Role> roles = rolesService.find("from Role");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("authorization/role-rights");
		mav.addObject("roles", roles);
		return mav;
	}
	
	@RequestMapping(value = "/{roleId}/role-rights-edit",method = RequestMethod.GET)
	public String roleRightsEdit(@PathVariable long roleId,Model model){
		Role role = rolesService.getEntityById(Role.class, roleId);
		RoleRightsForm roleRightsForm = new RoleRightsForm();
		List<Right> rights = rightService.getAll(Right.class);
		
		roleRightsForm.setRole(role);
		roleRightsForm.setRights(rights);
		roleRightsForm.fillRoleRights(role.getRights());
		
		model.addAttribute("roleRightsForm", roleRightsForm);
		return "authorization/role-rights";
	}
	
	@RequestMapping(value = "/role-rights",method = RequestMethod.POST)
	public String updateRoleRights(@ModelAttribute("RoleRightsForm") RoleRightsForm roleRightsForm){
		
		long roleId = roleRightsForm.getRole().getId();
		List<Long> roleRishts = roleRightsForm.getRoleRights();
		//List<Right> rights =  roleRightsForm.obtainRights(roleRishts);
		authorizationService.updateRoleRights(roleId,roleRishts);
		
		return "redirect:1/role-rights-edit";
	}
	
	
	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	public RolesService getRolesService() {
		return rolesService;
	}

	public void setRolesService(RolesService rolesService) {
		this.rolesService = rolesService;
	}

	
	public AuthorizationService getAuthorizationService() {
		return authorizationService;
	}

	public void setAuthorizationService(AuthorizationService authorizationService) {
		this.authorizationService = authorizationService;
	}

	public RightService getRightService() {
		return rightService;
	}

	public void setRightService(RightService rightService) {
		this.rightService = rightService;
	}
}
