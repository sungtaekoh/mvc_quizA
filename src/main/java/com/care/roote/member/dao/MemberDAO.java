package com.care.roote.member.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.roote.member.dto.MemberDTO;

@Repository
public class MemberDAO {
	ArrayList<MemberDTO> list;
	public MemberDAO() {
		System.out.println("dao ������ ����");
		list = new ArrayList<MemberDTO>();
	}
}
