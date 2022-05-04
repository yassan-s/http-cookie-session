package com.httpcookiesession.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/httptest")
public class HttpController {

	@GetMapping("/form")
	public String getForm(Model model) {

		return "http/form";
	}

	@GetMapping("/result")
	public String getResult(Model model,
			@RequestParam("name") String name,
			@RequestParam("password") String password) {

		model.addAttribute("nameKey", name);
		model.addAttribute("passwordKey", password);

		return "http/result";
	}

	@PostMapping("/result")
	public String getPostResult(Model model,
			@RequestParam("name") String name,
			@RequestParam("password") String password) {

		model.addAttribute("nameKey", name);
		model.addAttribute("passwordKey", password);

		return "http/result";
	}
}
