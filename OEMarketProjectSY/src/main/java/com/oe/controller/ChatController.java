package com.oe.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.oe.domain.RoomVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
public class ChatController {

	List<RoomVO> roomList = new ArrayList<RoomVO>();
	static int roomNumber = 0;
	
	@RequestMapping("/chat/chat")
	public void chat() {
		log.info("chat=========================");
//		model.addAttribute("user", vo.getUs_nickname());
	}
	/**
	 * 방 페이지
	 * @return
	 */
	@GetMapping("/chat/room")
	public void room() {
		log.info("room+++++++++++++++++++++++++++++");
	}
	
	/**
	 * 방 생성하기
	 * @param params
	 * @return
	 */
	
	@GetMapping("createRoom")
	public String createRoom() {
		return "createRoom";
	}
	
	@PostMapping("createRoom")
	public @ResponseBody List<RoomVO> createRoom(@RequestParam HashMap<Object, Object> params){
		String roomName = (String) params.get("roomName");
		if(roomName != null && !roomName.trim().equals("")) {
			RoomVO room = new RoomVO();
			room.setRoomNumber(++roomNumber);
			room.setRoomName(roomName);
			roomList.add(room);
		}
		return roomList;
	}
	
	/**
	 * 방 정보가져오기
	 * @param params
	 * @return
	 */
	@PostMapping("getRoom")
	public @ResponseBody List<RoomVO> getRoom(@RequestParam HashMap<Object, Object> params){
		return roomList;
	}
	
	/**
	 * 채팅방
	 * @return
	 */
	@GetMapping("moveChating")
	public String chating(@RequestParam HashMap<Object, Object> params, Model model ) {
		int roomNumber = Integer.parseInt((String) params.get("roomNumber"));
		
		List<RoomVO> new_list = roomList.stream().filter(o->o.getRoomNumber()==roomNumber).collect(Collectors.toList());
		String move="";
		if(new_list != null && new_list.size() > 0) {
			model.addAttribute("roomName", params.get("roomName"));
			model.addAttribute("roomNumber", params.get("roomNumber"));
			move = "redirect:/chat/chat";
		}else {
			move = "redirect:/chat/room";
		}
		return move;
	}
	
//	@GetMapping("/chat/moveChating")
//	public ModelAndView chating(@RequestParam HashMap<Object, Object> params) {
//		ModelAndView mv = new ModelAndView();
//		int roomNumber = Integer.parseInt((String) params.get("roomNumber"));
//		
//		List<RoomVO> new_list = roomList.stream().filter(o->o.getRoomNumber()==roomNumber).collect(Collectors.toList());
//		if(new_list != null && new_list.size() > 0) {
//			mv.addObject("roomName", params.get("roomName"));
//			mv.addObject("roomNumber", params.get("roomNumber"));
//			mv.setViewName("chat");
//		}else {
//			mv.setViewName("room");
//		}
//		return mv;
//	}
//	
	
}
