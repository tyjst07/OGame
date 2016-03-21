package com.ogame.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ogame.Service.resourceService;
import com.ogame.Service.userService;
import com.ogame.entities.resource;
import com.ogame.entities.users;

@Controller
@RequestMapping("/user")
public class usersController {

	@Autowired
	private userService userService;
	@Autowired
	private resourceService resourceService;
	
	@RequestMapping("/ifHasUser")
	public String ifHasUser(HttpSession httpSession,HttpServletRequest httpServletRequest){
		String username = httpServletRequest.getParameter("urn");
		String password = httpServletRequest.getParameter("pas");
		users user = userService.getUserId(username, password);
		if (user!=null) {
			httpServletRequest.setAttribute("user",user);
			resourceService.updateResource(user.getUid());
			resource resource = resourceService.getByUid(user.getUid());
			resourceService.updateResource(user.getUid());
			httpServletRequest.setAttribute("resource", resource);
			return "/index";
		} else {
			return "/error";
		}
		
	}
	
	@RequestMapping("/toAddUser")
	public String toAddUser(){
		return "/signin";
	}
	
	@RequestMapping("/backToLogin")
	public String bacetologin(){
		return "/login";
	}
	
	@RequestMapping("/addUser")
	public String addUser(HttpSession httpSession,HttpServletRequest httpServletRequest){
		String username = httpServletRequest.getParameter("urn");
		String password = httpServletRequest.getParameter("pas");
		if (StringUtils.isEmpty(password)||StringUtils.isEmpty(username)) {
			return "/emptyPassword";
		}else{
			users user = userService.getUserId(username);
			if (user!=null) {
				return "/alreadyhave";
			} else {
				if (userService.addUser(username, password)) {
					if (resourceService.add(userService.getUserId(username, password).getUid())) {
						return "/successadduser";
					} else {
						return "/erroradduser";
					}					
				} else {
					return "/erroradduser";
				}
			}
		}
		
	}
	
}
