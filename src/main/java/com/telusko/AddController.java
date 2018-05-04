package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.service.AddService;

@Controller
public class AddController {

		@RequestMapping("/add")
		public ModelAndView Add(HttpServletRequest request, HttpServletResponse response) {
			int i = Integer.parseInt(request.getParameter("t1"));
			int j = Integer.parseInt(request.getParameter("t2"));
			//int k = i+j;
			AddService as = new AddService();
			int k = as.add(i, j);
			ModelAndView mv  = new ModelAndView();
			mv.setViewName("Display.jsp");
			mv.addObject("result",k);
			return mv;
		}
		
		@RequestMapping("/added")
		public void added() {}
}
