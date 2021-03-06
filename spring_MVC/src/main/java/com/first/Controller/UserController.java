package com.first.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.first.domain.Account;

@Controller
@RequestMapping("/test")
public class UserController {
	
	@RequestMapping("/user")
	public String testUser(Model model) {
		Account user = new Account();
		user.setUsername("Kenny");
		user.setPassword("777");
		user.setMoney(1000000);
		model.addAttribute("user", user);
		return "user";
	}
	
	/**@RequestMapping("/testajax")
	public void testajax(@RequestBody String body) {
		System.out.println("AJAX!");
		System.out.println(body);
	}**/
	//搭配json的寫法
	
	@RequestMapping("/testajax")
	public @ResponseBody Account testajax(@RequestBody Account user2) {
		System.out.println("AJAX!");
		//從ajax傳來的json資訊直接封裝到user對象內
		System.out.println(user2);
		user2.setUsername("changeLo");
		user2.setPassword("npwd");
		//響應方式
		return user2;
	}

}
