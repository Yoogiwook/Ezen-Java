package com.oe.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.oe.domain.MyPageVO;
import com.oe.service.MyPageService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/mypage/*")
public class MyPageController {
   private MyPageService service;
   
   @GetMapping({"/mypage", "/withdrawal"})
   public void get(String my_id, Model model) {
      log.info("mypage or withdrawal");
      model.addAttribute("mypage", service.get(my_id));
      model.addAttribute("user", service.getUserInfo(my_id));
      model.addAttribute("countingHeart", service.getmyCountHB(my_id));
      log.info(my_id);
      log.info(service.getmyCountHB(my_id));
   }
   
   @PostMapping("/profileEdit")
   public String profileEdit(MyPageVO vo, RedirectAttributes rttr, MultipartHttpServletRequest mtfRequest) {
        String src = mtfRequest.getParameter("src");
        System.out.println("src value : " + src);
        MultipartFile mf = mtfRequest.getFile("file");

        String path = "C:\\oe_upload\\";

        String originFileName = mf.getOriginalFilename();
        long fileSize = mf.getSize();

        System.out.println("originFileName : " + originFileName);
        System.out.println("fileSize : " + fileSize);

        String safeFile = path + originFileName;

        try {
            mf.transferTo(new File(safeFile));
            vo.setMy_image(originFileName);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
      
      log.info("profileEdit : " + vo);
      service.profileEdit(vo);
      service.nickEdit_marketuser(vo);
      service.nickEdit_marketboard(vo);
      service.nickEdit_buyboard(vo);
      service.nickEdit_sellboard(vo);
      service.nickEdit_heartboard(vo);
      service.nickEdit_center(vo);
      rttr.addAttribute("my_id", vo.getMy_id());
      rttr.addFlashAttribute("result", "success");
      return "redirect:/mypage/mypage";
   }
   
   @PostMapping("/withdrawal")
	public String withdrawal(MyPageVO vo, RedirectAttributes rttr) {
		log.info("withdrawal : " + vo);
		service.saveWithdrawal(vo);
		service.moveWithdrawal(vo);
		service.withdrawal(vo);
		rttr.addFlashAttribute("result", "success");
		return "redirect:/login.do";
	}
}