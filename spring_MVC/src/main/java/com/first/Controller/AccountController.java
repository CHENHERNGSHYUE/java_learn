package com.first.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.first.domain.Account;

@Controller
@RequestMapping(value="/param")
public class AccountController {
	
	@RequestMapping(value="/save")
	public String check(Account account) {
		System.out.print(account);
		return "save"; //for home.jsp
	}

}
