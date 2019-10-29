package com.web.jks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.app.dto.MemberDto;
import com.web.jks.dao.LoginDao;

@Service
public class LoginService {

	@Autowired
	private LoginDao dao;
	
	
	public void setDao(LoginDao dao) {
		this.dao = dao;
	}


	public String login(MemberDto dto) {
		String result = dao.login(dto);		
		return result;
	}

	
}
