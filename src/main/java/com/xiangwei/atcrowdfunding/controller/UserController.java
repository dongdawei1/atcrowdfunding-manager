package com.xiangwei.atcrowdfunding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")//所有/user前缀的请求都到这里来
public class UserController {
	@RequestMapping("/index")
	public String index() {
		return "user/index";
	}
}
