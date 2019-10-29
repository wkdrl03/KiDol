package com.web.jks.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.web.app.dto.MemberDto;
import com.web.jks.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService service;
		
	public void setService(LoginService service) {
		this.service = service;
	}

	@RequestMapping(value = "/admin/loginform.do")
	public String LoginForm() {
		return "admin/adminlogin_form";
	}
	
	@RequestMapping(value="/admin/adminLogin.do", method = RequestMethod.POST)
	public String login(MemberDto dto,Model model,HttpServletRequest request) {
		System.out.println("controller");
		
		String result = service.login(dto);
		String msg = "";
		if(result == null) {
			msg="로그인 실패";
		}else {
			request.getSession().setAttribute("loginName", dto.getName());
			return "admin/mainPage";
		}
		model.addAttribute("msg", msg);
		return "admin/loginFail";
	}
	
	@RequestMapping(value = "/admin/logout.do")
	public String LogOut(HttpServletRequest request) {
		request.getSession().removeAttribute("loginName");
		return "admin/adminlogin_form";
	}
}



















