package com.bexperr.dash.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JwtController {

	@RequestMapping({ "/api/jwt" })
	public String jwt() {
		return "Acceso con json web token";
	}

}
