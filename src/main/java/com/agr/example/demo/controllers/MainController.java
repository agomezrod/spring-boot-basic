package com.agr.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * Comentario para forzar un commit
 * 
 */

@Controller
public class MainController {
	
/*
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Hello World";
	}
*/
	@RequestMapping("/")
	public String index() {
		return "hello.html";
	}
	
	
	
}
