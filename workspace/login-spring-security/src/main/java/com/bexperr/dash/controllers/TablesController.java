package com.bexperr.dash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bexperr.dash.util.RutasDelSistema;


@Controller
@RequestMapping("/tables")
public class TablesController {
	
	@GetMapping("/data")
	public String data() {
		
		return RutasDelSistema.DATA.getPath();
	}
	
	@GetMapping("/jsgrid")
	public String jsgrid() {
		
		return RutasDelSistema.JSGRID.getPath();
	}
	
	@GetMapping("/simple")
	public String simple() {
		
		return RutasDelSistema.SIMPLE.getPath();
	}

}
