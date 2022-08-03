package com.oe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.oe.domain.HeartBoardVO;
import com.oe.service.HeartBoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/mypage/*")
@AllArgsConstructor
public class HeartBoardController {
	private HeartBoardService service;
	
	@GetMapping("/heartBoard")
	public void get(String he_id, Model model) {
		log.info("get : " + he_id);
		model.addAttribute("heartList", service.getListHB(he_id));
		model.addAttribute("marketList", service.getListMB(he_id));
//		model.addAttribute("heartAmount", service.getTotal(he_id));
	}
	
	@PostMapping("/removeHeart")
	public String removeHeart(HeartBoardVO vo, RedirectAttributes rttr) {
		log.info("removeHeart : " + vo);
		service.removeHeart(vo);
		rttr.addAttribute("he_id", vo.getHe_id());
		return "redirect:/mypage/heartBoard";
	}
}
