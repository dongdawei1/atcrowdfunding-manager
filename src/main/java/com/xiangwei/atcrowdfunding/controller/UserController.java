package com.xiangwei.atcrowdfunding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")//����/userǰ׺�����󶼵�������
public class UserController {
	@RequestMapping("/index")
	public String index() {
		return "user/index";
	}
}
