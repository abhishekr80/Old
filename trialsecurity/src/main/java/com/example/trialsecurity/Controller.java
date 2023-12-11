package com.example.trialsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String Welcome() {
		return ("<h1>Welcome To Spring Security</h1>");
	}

}
