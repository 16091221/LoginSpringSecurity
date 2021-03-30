package com.bexperr.dash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bexperr.dash.util.RutasDelSistema;

@Controller
@RequestMapping("/charts")
public class ChartsController {
	
	@GetMapping(value = "/chartjs")
	public String chartjs() {
		
		return RutasDelSistema.CHARTJS.getPath();
	}
	
	@GetMapping(value = "/flot")
	public String flot() {
		
		return RutasDelSistema.FLOT.getPath();
	}
	
	@GetMapping(value = "/inline")
	public String inline() {
		
		return RutasDelSistema.INLINE.getPath();
	}
	

}
