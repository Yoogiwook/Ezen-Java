package com.oe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.oe.domain.MarketUserVO;
import com.oe.service.MarketUserService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/user/*")
@AllArgsConstructor
public class MarketUserController {
	
	private MarketUserService userService;
	
	@GetMapping("join")
	public void joinUser() {}
	@PostMapping("join")
	public String joinUser(MarketUserVO vo, RedirectAttributes rttr) {
		log.info("vo : " + vo);
		userService.register(vo);
		userService.MyRegister(vo);
		rttr.addFlashAttribute("result", vo.getUs_id());
		return "redirect:/";
	}
	
	@GetMapping({"get","update"})
	public void getUser(String us_id, Model model) {
		log.info("getUser : " + us_id);
		model.addAttribute("user", userService.get(us_id));  
		
	}
	
	@PostMapping("update")
	   public String updateUser(MarketUserVO vo, RedirectAttributes rttr) {
	      log.info("update vo : " + vo);
	      userService.modify(vo);
	      userService.modifyAdrr(vo);
	      rttr.addAttribute("my_id", vo.getUs_id());
	      return "redirect:/mypage/mypage";
	   }
	
	
	@GetMapping("findId")
	public String findId() {
		return "user/findId";
	}
	@PostMapping("findId")
	public String findId(MarketUserVO vo, Model model) {
		userService.findId(vo);
		
		if(vo.getUs_id() == null) {
			log.info(vo);
			model.addAttribute("check", 1);
		}else {
			model.addAttribute("check", 0);
			model.addAttribute("us_id", vo.getUs_id());
		}
		return "user/findId";
	}

	
	@GetMapping("findPass")
	public String findPass() {
		return "user/findPass";
	}
	
	@PostMapping("findPass")
	public void findPass(MarketUserVO vo) {
		userService.findPass(vo);
	}
	
	@GetMapping("idCheck")
	public void checkID(Model model, String us_id, String result) {
		log.info("idCheck=============================");
		log.info(us_id);
		if(result != null) {
			model.addAttribute("result", result);
		}else {
			result="";
			model.addAttribute("result", result);
		}
		
		model.addAttribute("user", us_id);
	}
	
	@PostMapping("idCheck")
	public String checkID(RedirectAttributes rttr,String us_id) {
		String result ;
		if(userService.checkID(us_id) != null) {
			result ="N";
		}else {
			result="Y";
		}
		rttr.addAttribute("result", result);
		rttr.addAttribute("us_id", us_id);
		
		log.info(us_id);
		log.info(result);
		return "redirect:/user/idCheck";
	}
	
	@GetMapping("nicknameCheck")
	public void checkNickname(Model model, String us_nickname, String result) {
		log.info("nicknameCheck=============================");
		log.info(us_nickname);
		if(result != null) {
			model.addAttribute("result", result);
		}else {
			result="";
			model.addAttribute("result", result);
		}
		
		model.addAttribute("nickname", us_nickname);
	}
	
	@PostMapping("nicknameCheck")
	public String checkNickname(RedirectAttributes rttr,String us_nickname) {
		String result ;
		if(userService.checkNickname(us_nickname) != null) {
			result ="N";
		}else {
			result="Y";
		}
		rttr.addAttribute("result", result);
		rttr.addAttribute("us_nickname", us_nickname);
		
		log.info(us_nickname);
		log.info(result);
		return "redirect:/user/nicknameCheck";
	}
}//
