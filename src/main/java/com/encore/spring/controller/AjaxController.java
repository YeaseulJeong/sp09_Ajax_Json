package com.encore.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.encore.spring.domain.Person;

@Controller
public class AjaxController {
	@RequestMapping("synch.do")
	public String synch(Model model) {  // model 에 binding 함
		System.out.println("동기통신 실행됨");
		model.addAttribute("info", "와~ 동기통신 성공이다아아아아아");
		return "synch_result";
	}
	
	@RequestMapping("ASynch.do")
	public ModelAndView asynch() {
		System.out.println("비동기통신 실행됨");
		return  new ModelAndView("JsonView", "person", new Person("강호동", "방배동")); //출력페이지가 따로 없을 때 servlet-context 에서 지정한 페이지로 JsonView를 대신해보여줌
	}

}
