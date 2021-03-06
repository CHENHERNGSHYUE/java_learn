package com.first.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnnoController {
	
	@RequestMapping(value="/anno")
	public String testAnno(@RequestParam(value="name")String username) {
		System.out.println("get anno");
		System.out.print(username);
		return "anno";
	}

}
