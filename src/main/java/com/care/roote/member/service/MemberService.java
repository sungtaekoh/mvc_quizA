package com.care.roote.member.service;

import org.springframework.ui.Model;

public interface MemberService {
	public void test();
//interface���� ������̼��� ������� �ʴ´�
	
	public void register(String id, String pwd, String name);
	public void memberList(Model model);
}

