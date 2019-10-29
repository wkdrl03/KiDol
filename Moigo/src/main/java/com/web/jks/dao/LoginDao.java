package com.web.jks.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.web.app.dto.MemberDto;

public class LoginDao extends SqlSessionDaoSupport{

	public String login(MemberDto dto) {
		String result = getSqlSession().selectOne("login.login",dto);
		System.out.println(result);
		return result;
	}

	
}
