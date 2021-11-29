package com.care.roote.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.roote.member.dto.MemberDTO;
import com.care.roote.member.service.MemberService;

@Controller
@RequestMapping("member")//공통적인걸 적으면 경로 생략 가능
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
	@GetMapping("/index")//url경로 member/index
	public String memberIndex() {
		return "member/index";//패키지 경로
	}
	@GetMapping("/register_view")///member/register_view
	public String registerView() {
		return "member/register_view";
	}
	@GetMapping("/member_list")///member/register_list
	public String registerList(Model model) {
		ms.memberList(model);

			return "/member/member_list";
		
		return "member/member_list";
	}
	@PostMapping("register1")
	public String register1(HttpServletRequest req){
		System.out.println(req.getParameter("id"));
		System.out.println(req.getParameter("pwd"));
		System.out.println(req.getParameter("name"));
		
		ms.register(req.getParameter("id"),
				req.getParameter("pwd"),
				req.getParameter("name")
				);
		
		return "redirect:index";
	}
	@PostMapping("register2")
	public String register2(MemberDTO dto){
		System.out.println("dto.id : "+dto.getId());
		System.out.println("dto.pwd : "+dto.getPwd());
		System.out.println("dto.name : "+dto.getName());
		
				
		
		return "redirect:index";
	}
}
