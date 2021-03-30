package com.bexperr.dash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bexperr.dash.util.RutasDelSistema;

@Controller
@RequestMapping("/UI")
public class UIController {

	@GetMapping(value = "/buttons")
	public String buttons() {
		return RutasDelSistema.BUTTONS.getPath();
	}
	
	@GetMapping(value = "/general")
	public String general() {
		return RutasDelSistema.UIGENERAL.getPath();
	}
	
	@GetMapping(value = "/icons")
	public String icons() {
		return RutasDelSistema.ICONS.getPath();
	}
	
	@GetMapping(value = "/modals")
	public String modals() {
		return RutasDelSistema.MODALS.getPath();
	}
	
	@GetMapping(value = "/navbar")
	public String navbar() {
		return RutasDelSistema.NAVBAR.getPath();
	}
	
	@GetMapping(value = "/ribbons")
	public String ribbons() {
		return RutasDelSistema.RIBBONS.getPath();
	}
	
	@GetMapping(value = "/sliders")
	public String sliders() {
		return RutasDelSistema.SLIDERS.getPath();
	}
	
	@GetMapping(value = "/timeline")
	public String timeline() {
		return RutasDelSistema.TIMELINE.getPath();
	}
}
