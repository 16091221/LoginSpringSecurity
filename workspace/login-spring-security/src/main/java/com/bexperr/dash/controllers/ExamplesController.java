package com.bexperr.dash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bexperr.dash.util.RutasDelSistema;

@Controller
@RequestMapping("/examples")
public class ExamplesController {
	
	@GetMapping("/404")
	public String Error404() {
		
		return RutasDelSistema.ERROR404.getPath();
	}
	
	@GetMapping("/500")
	public String Error500() {
		
		return RutasDelSistema.ERROR505.getPath();
	}
	
	@GetMapping("/blank")
	public String blank() {
		
		return RutasDelSistema.BLANK.getPath();
	}
	
	@GetMapping("/contacts")
	public String contacts() {
		
		return RutasDelSistema.CONTACTS.getPath();
	}
	
	@GetMapping("/e-commerce")
	public String commerce() {
		
		return RutasDelSistema.ECOMMERCE.getPath();
	}
	
	@GetMapping("/forgot-password")
	public String forgotpassword() {
		
		return RutasDelSistema.FORGOTPASSWORD.getPath();
	}
	
	@GetMapping("/invoice")
	public String invoice() {
		
		return RutasDelSistema.INVOICE.getPath();
	}
	
	@GetMapping("/invoice-print")
	public String invoicePrint() {
		
		return RutasDelSistema.INVOICEPRINT.getPath();
	}
	
	@GetMapping("/language-menu")
	public String languageMenu() {
		
		return RutasDelSistema.LANGUAGEMENU.getPath();
	}
	
	@GetMapping("/legacy-user-menu")
	public String legacyUserMenu() {
		
		return RutasDelSistema.LEGACYUSERMENU.getPath();
	}
	
	@GetMapping("/lockscreen")
	public String lockscreen() {
		
		return RutasDelSistema.LOCKSCREEN.getPath();
	}
	
	@GetMapping("/login")
	public String login() {
		
		return RutasDelSistema.LOGIN.getPath();
	}
	
	@PostMapping("/login")
	public String postLogin() {
		
		return RutasDelSistema.LOGIN.getPath();
	}
	
	@GetMapping("/pace")
	public String pace() {
		
		return RutasDelSistema.PACE.getPath();
	}
	
	@GetMapping("/profile")
	public String profile() {
		
		return RutasDelSistema.PROFILE.getPath();
	}
	
	@GetMapping("/project-add")
	public String projectAdd() {
		
		return RutasDelSistema.PROJECTADD.getPath();
	}
	
	@GetMapping("/project-detail")
	public String projectDetail() {
		
		return RutasDelSistema.PROJECTDETAIL.getPath();
	}
	
	@GetMapping("/project-edit")
	public String projectEdit() {
		
		return RutasDelSistema.PROJECTEDIT.getPath();
	}
	
	@GetMapping("/projects")
	public String projects() {
		
		return RutasDelSistema.PROJECTS.getPath();
	}
	
	@GetMapping("/recover-password")
	public String recoverPassword() {
		
		return RutasDelSistema.RECOVERPASSWORD.getPath();
	}
	
	@PostMapping("/recover-password")
	public String postRecoverPassword() {
		
		return RutasDelSistema.RECOVERPASSWORD.getPath();
	}
	
	@GetMapping("/register")
	public String register() {
		
		return RutasDelSistema.REGISTER.getPath();
	}


}
