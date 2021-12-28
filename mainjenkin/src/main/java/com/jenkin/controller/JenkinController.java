package com.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class JenkinController {

	@GetMapping("/firstJenkin")
	public String firstJenkin() {

		return "firstJenkin-Published";

	}

}
