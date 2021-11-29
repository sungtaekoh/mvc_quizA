package com.care.roote.member.service;

import org.springframework.ui.Model;

public interface MemberService {
	public void test();
//interface에는 어노테이션을 사용하지 않는다
	
	public void register(String id, String pwd, String name);
	public void memberList(Model model);
}

