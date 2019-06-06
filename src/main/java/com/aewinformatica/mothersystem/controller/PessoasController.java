package com.aewinformatica.mothersystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pessoas")
public class PessoasController {

	@GetMapping("/nova")
	public String nova() {
		
		return "CadastroPessoa";
		
	}
}
