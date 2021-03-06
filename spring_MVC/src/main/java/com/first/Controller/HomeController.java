package com.first.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String start() {
		//System.out.print("start");
		//return "start"; //for home.jsp
		return "response"; //for home.jsp
	}
	
	@RequestMapping(value="/hello")
	public String testservlet(HttpServletRequest req, HttpServletResponse res) {
		System.out.println(req.getSession());
		System.out.println(res);
		return "home"; //for home.jsp
	}
	
	@RequestMapping(value="/sign")
	public String check() {
		System.out.print("sign~");
		return "sign"; //for home.jsp
	}
	
}
