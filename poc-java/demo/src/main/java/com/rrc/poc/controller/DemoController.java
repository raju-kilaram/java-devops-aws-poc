package com.rrc.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {
	@GetMapping("/getMessage")
	public String getMessage() {
		return "Hello! This is a Demo Application...";
	}

}
