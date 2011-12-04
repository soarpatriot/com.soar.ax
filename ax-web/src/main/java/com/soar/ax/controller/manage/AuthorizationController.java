/**
 * 
 */
package com.soar.ax.controller.manage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.soar.ax.controller.BaseController;
import com.soar.ax.entity.authrization.Role;
import com.soar.ax.entity.authrization.User;
import com.soar.ax.service.manage.RolesService;
import com.soar.ax.service.manage.UsersRolesService;
import com.soar.ax.service.manage.UsersService;
import com.soar.ax.wapper.RoleCheckWapper;
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
	private UsersRolesService usersRolesService;
	
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

	public UsersRolesService getUsersRolesService() {
		return usersRolesService;
	}

	public void setUsersRolesService(UsersRolesService usersRolesService) {
		this.usersRolesService = usersRolesService;
	}
}
