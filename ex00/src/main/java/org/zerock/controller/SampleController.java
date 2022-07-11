package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
   
   @RequestMapping(value="basic", method = RequestMethod.GET )
   public String basic() {
      log.info("basic----------------");
      return "basic";
   }
   @RequestMapping(value="basic", method = RequestMethod.POST )
   public String basic2() {
      log.info("basic----------------");
      return "basic";
   }
   
   @GetMapping("/basicOnlyGet")
   public void basicGet2() {
      log.info("basicGet2----------------");
   }
   
}