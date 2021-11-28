package com.care.roote.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.roote.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService ms;
	public MemberController() {
		System.out.println("controller  생성자 실행");
	}
	@RequestMapping("test")
	public void test() {
		System.out.println(ms);//MemberService가 ms에 만들었는지 확인한다
	}
}
