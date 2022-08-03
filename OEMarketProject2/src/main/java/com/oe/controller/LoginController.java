package com.oe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oe.domain.MarketUserVO;
import com.oe.service.MarketUserService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/")
@AllArgsConstructor
public class LoginController {

	private MarketUserService userService;
	// 로그인 login.jsp로 이동하는 매핑
//	@GetMapping({ "login.do", "board/login.do" })
	@GetMapping("login")
	public String login(Model model) {

		return "user/login";
	}
	
	@PostMapping({ "loginUser", "board/loginUser" })
	public String loginUser(MarketUserVO vo, HttpServletRequest request, Model model) {
		MarketUserVO userVO = userService.userCheck(vo);
		log.info(vo);

		if (userVO != null && userVO.getUs_id() != null) {
			log.info(userVO);
			HttpSession session = request.getSession();
			session = request.getSession();
			session.setAttribute("isLogOn", true);
			session.setAttribute("login", userVO);
//	         model.addAttribute("result","yes" );
			return "index";
		} else {
			model.addAttribute("result", "no");
			return "/user/login";
		}
	}
	
	@GetMapping("logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.setAttribute("isLogOn", false);
		session.removeAttribute("login");
		return "index";
	}
}
