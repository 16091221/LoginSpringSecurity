package com.bexperr.dash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.bexperr.dash.util.RutasDelSistema;

@Controller
public class PagesController {

	@GetMapping(value = "/calendar")
	public String calendar() {
		return RutasDelSistema.CALENDAR.getPath();
	}
	
	@GetMapping(value = "/gallery")
	public String gallery() {
		return RutasDelSistema.GALLERY.getPath();
	}
	
	@GetMapping(value = "/widgets")
	public String widgets() {
		return RutasDelSistema.WIDGETS.getPath();
	}
}
