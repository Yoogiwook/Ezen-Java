package com.ezen.market.OEM.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.ezen.market.OEM.OEMarketBoardService;
import com.ezen.market.OEM.OEMarketBoardVO;



@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private OEMarketBoardService boardService;
	
	
	//검색 조건 목록 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목","TITLE");
		conditionMap.put("내용","CONTENT");
		return conditionMap;
	}
	
	
//   글 등록
   @RequestMapping("/uploadFile.do")
   public String insertBoard(OEMarketBoardVO vo) throws IOException {
	   MultipartFile uploadFile = vo.getImage();
	   System.out.println("image: " + vo.getImage());
	   System.out.println("title: " + vo.getTitle());
	   System.out.println("title: " + vo.getId());
	   System.out.println("title: " + vo.getPass());
	   System.out.println("title: " + vo.getName());
	   System.out.println("title: " + vo.getContent());
	   if(!uploadFile.isEmpty()) {
		   String fileName = uploadFile.getOriginalFilename();
		   uploadFile.transferTo(new File("c:/upload/"+fileName));
	   }
	   boardService.insertBoard(vo);
//	   return "getBoardList.do";
	   return null;
	   
   } //end of insertBoard

//   글 수정
   @RequestMapping("/updateBoard.do")
   public String updateBoard(@ModelAttribute("board")OEMarketBoardVO vo) {
	   System.out.println("번호 : "+vo.getNum());
	   System.out.println("제목 : "+vo.getTitle());
	   System.out.println("작성자 : "+vo.getName());
	   System.out.println("내용 : "+vo.getContent());
	   System.out.println("등록일 : "+vo.getBdate());
	   System.out.println("조회수 : "+vo.getCount());
	   boardService.updateBoard(vo);
	   return "getBoardList.do";
   } //end of updateBoard
   
//   글 삭제
   @RequestMapping("/deleteBoard.do")
   public String deleteBoard(OEMarketBoardVO vo) {
	   boardService.deleteBoard(vo);
      return "getBoardList.do";
   } //end of deleteBoard
   
//   글 상세 조회
   @RequestMapping("/getBoard.do")
   public String getBoard(OEMarketBoardVO vo, Model model) {
       model.addAttribute("board",boardService.getBoard(vo));
	   return "getBoard.jsp";
   } //end of getBoard
   
//   글 목록 검색
//   @RequestMapping("/getBoardList.do")
//   public String getBoardList(OEMarketBoardVO vo, Model model) {
//	   
//	   if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
//	   if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
//	   
//	   model.addAttribute("boardList",boardService.getBoardList(vo));
//	   return "getBoardList.jsp";
//	   
//	   
//	   
//   } //end of getBoardList

}