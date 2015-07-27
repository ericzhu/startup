package com.el.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.el.app.query.Page;
import com.el.cms.model.User;

@Controller
public class UserController {

	@RequestMapping("/admin/user/list")
	public String list(Model model) {
		Page<User> userPage = new Page<User>();
		model.addAttribute("users", userPage);
		return "user/list";
	}
}
