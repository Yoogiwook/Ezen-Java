package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample2/*")
@Log4j
public class SampleController {
	
	@GetMapping("/basic")
	public String basic(SampleDTO vo, Model model) {
		log.info("basic-----------------------");
		log.info("vo ==> " + vo);
		model.addAttribute("list", vo);
		
		return "sample/basic";
	}
}
