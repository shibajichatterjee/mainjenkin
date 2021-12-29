package com.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class JenkinController {

	@GetMapping("/firstJenkin")
	public String firstJenkin() {

		return "firstJenkin-Published";

	}
	@GetMapping("/jenkin")
	public String jenkin() {

		return "Jenkin-Published";

	}

	
	@GetMapping("/jenkinn")
	public String jenkinn() {

		return "Jenkinn-Published-Jenkinn";

	}
}
