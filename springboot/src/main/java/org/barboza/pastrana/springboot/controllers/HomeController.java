package org.barboza.pastrana.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

		@RequestMapping("/")
		public String home()
		{
			
			return "Hi from Spring Boot";
		}
	
}
