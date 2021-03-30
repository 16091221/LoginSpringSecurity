package com.bexperr.dash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bexperr.dash.util.RutasDelSistema;

@Controller
@RequestMapping("/forms")
public class FormsController {

	@GetMapping("/advanced")
	public String advance() {
		
		return RutasDelSistema.ADVANCED.getPath() ;
	}
	
	@GetMapping("/editors")
	public String editors() {
		
		return RutasDelSistema.EDITORS.getPath();
	}
	
	@GetMapping("/general")
	public String general() {
		
		return RutasDelSistema.GENERAL.getPath();
	}
	
	@GetMapping("/validation")
	public String validation() {
		
		return RutasDelSistema.VALIDATION.getPath();
	}
}
