package com.bexperr.dash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bexperr.dash.util.RutasDelSistema;

@Controller
@RequestMapping("/layout")
public class LayoutController {

	@GetMapping(value = "/boxed")
	public String boxed() {
		return RutasDelSistema.BOXED.getPath();
	}
	
	@GetMapping(value = "/collapsed-sidebar")
	public String collapsedSidebar() {
		return RutasDelSistema.COLLAPSEDSIDEBAR.getPath();
	}
	
	@GetMapping(value = "/fixed-footer")
	public String fixedFooter() {
		return RutasDelSistema.FIXEDFOOTER.getPath();
	}
	
	@GetMapping(value = "/fixed-sidebar")
	public String fixedSidebar() {
		return RutasDelSistema.FIXEDSIDEBAR.getPath();
	}
	
	@GetMapping(value = "/fixed-topnav")
	public String fixedTopnav() {
		return RutasDelSistema.FIXEDTOPNAV.getPath();
	}
	
	@GetMapping(value = "/top-nav")
	public String topNav() {
		return RutasDelSistema.TOPNAV.getPath();
	}
	
	@GetMapping(value = "/top-nav-sidebar")
	public String topNavSidebar() {
		return RutasDelSistema.TOPNAVSIDEBAR.getPath();
	}
}
