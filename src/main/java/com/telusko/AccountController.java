package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {
	
	@RequestMapping("/auth")
	public ModelAndView CheckUser(HttpServletRequest request, HttpServletResponse response) {
		
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		ModelAndView mv  = new ModelAndView();
		if(new com.telusko.login.LoginService().Check(uname, pword)) {
			
			mv.setViewName("success.jsp");
			mv.addObject("result","You are successfully logged in ...");
		}
		else {
			mv.setViewName("login.jsp");
			mv.addObject("result","Login Issue");
		}

		return mv;
		
	}
}
