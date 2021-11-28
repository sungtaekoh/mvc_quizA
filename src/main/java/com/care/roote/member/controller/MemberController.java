package com.care.roote.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.roote.member.service.MemberService;

@Controller
@RequestMapping("member")//�������ΰ� ������ ��� ���� ����
public class MemberController {
	@Autowired //����� null�� ���
	MemberService ms;
	public MemberController() {
		System.out.println("controller  ������ ����");
	}
	@RequestMapping("test")
	public void test() {
		System.out.println("ms : "+ms);//MemberService�� ms�� ��������� Ȯ���Ѵ�
		ms.test();
	}
	@GetMapping("/index")//url��� member/index
	public String memberIndex() {
		return "member/index";//��Ű�� ���
	}
	@GetMapping("/register_view")///member/register_view
	public String registerView() {
		return "member/register_view";
	}
	@GetMapping("/register_list")///member/register_list
	public String registerList() {
		return "member/register_list";
	}
	@PostMapping("register")
	public String register(@RequestParam("id") String id,
			@RequestParam String pwd,
			@RequestParam String name) {
		System.out.println(id);
		System.out.println(pwd);
		System.out.println(name);
		return "member/index";
	}
}
