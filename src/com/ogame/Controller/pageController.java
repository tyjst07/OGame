package com.ogame.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ogame.entities.resource;
import com.ogame.Service.resourceService;

@Controller
@RequestMapping("/toPage")
public class pageController {
	
	@Autowired
	private resourceService resourceService;

	@RequestMapping("/toIndex")
	public String toIndex(int uid,HttpServletRequest httpServletRequest){
		resourceService.updateResource(uid);
		resource resource = resourceService.getByUid(uid);
		resourceService.updateResource(uid);
		httpServletRequest.setAttribute("resource", resource);
		return "/index";
	}
	
	@RequestMapping("/toConstruction")
	public String toConstruction(int uid,HttpServletRequest httpServletRequest){
		resourceService.updateResource(uid);
		resource resource = resourceService.getByUid(uid);
		resourceService.updateResource(uid);
		httpServletRequest.setAttribute("resource", resource);
		return "/construction";
	}
	
	@RequestMapping("/toShipyard")
	public String toShipyard(int uid,HttpServletRequest httpServletRequest){
		resourceService.updateResource(uid);
		resource resource = resourceService.getByUid(uid);
		resourceService.updateResource(uid);
		httpServletRequest.setAttribute("resource", resource);
		return "/shipyard";
	}
	
	@RequestMapping("/toUniverse")
	public String toUniverse(int uid,HttpServletRequest httpServletRequest){
		resourceService.updateResource(uid);
		resource resource = resourceService.getByUid(uid);
		resourceService.updateResource(uid);
		httpServletRequest.setAttribute("resource", resource);
		return "/universe";
	}
	
	@RequestMapping("/toMessage")
	public String toMessage(int uid,HttpServletRequest httpServletRequest){
		resourceService.updateResource(uid);
		resource resource = resourceService.getByUid(uid);
		resourceService.updateResource(uid);
		httpServletRequest.setAttribute("resource", resource);
		return "/message";
	}
}
