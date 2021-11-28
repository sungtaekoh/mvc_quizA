package com.care.roote.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.roote.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired //지우면 null값 뜬다
	MemberService ms;
	public MemberController() {
		System.out.println("controller  생성자 실행");
	}
	@RequestMapping("test")
	public void test() {
		System.out.println("ms : "+ms);//MemberService가 ms에 만들었는지 확인한다
		ms.test();
	}
	@GetMapping("mem/index")//url경로
	public String memberIndex() {
		return "member/index";//패키지 경로
	}
}
