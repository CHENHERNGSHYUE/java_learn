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
	//�f�tjson���g�k
	
	@RequestMapping("/testajax")
	public @ResponseBody Account testajax(@RequestBody Account user2) {
		System.out.println("AJAX!");
		//�qajax�ǨӪ�json��T�����ʸ˨�user��H��
		System.out.println(user2);
		user2.setUsername("changeLo");
		user2.setPassword("npwd");
		//�T���覡
		return user2;
	}

}
