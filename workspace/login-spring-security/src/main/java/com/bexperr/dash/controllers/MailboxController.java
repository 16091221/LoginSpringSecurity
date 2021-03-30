package com.bexperr.dash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bexperr.dash.util.RutasDelSistema;


@Controller
@RequestMapping("/mailbox")
public class MailboxController {
	
	@GetMapping("/compose")
	public String compose() {
		
		return RutasDelSistema.COMPOSE.getPath();
	}
	
	@GetMapping("/mailbox")
	public String mailbox() {
		
		return RutasDelSistema.MAILBOX.getPath();
	}
	
	@GetMapping("/read-mail")
	public String readmail() {
		
		return RutasDelSistema.READMAIL.getPath();
	}

}
