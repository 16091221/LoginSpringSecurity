package com.bexperr.dash.controllers;
import com.bexperr.dash.util.RutasDelSistema;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class HomeController {

	@GetMapping(value = { "/index", "/", "/home" })
	public String index() {
		return RutasDelSistema.INDEX.getPath();
	}

	@PostMapping(value = "/index")
		public String postIndex() {
			return RutasDelSistema.INDEX.getPath();
		}
	
	@Secured("ROLE_ADMIN")
	@GetMapping(value = "/starter")
	public String starter() {
		return RutasDelSistema.STARTER.getPath();
	}
}
