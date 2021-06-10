package com.wjz.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wjz.demo.entities.User;
import com.wjz.demo.mapper.UserMapper;

@Controller
public class LoginController {
	
	@Autowired
	UserMapper userMapper;

	@PostMapping(value="/user/login")
	public String login(@RequestParam("username")String username,
					    @RequestParam("password")String password,
					    Map<String,String> map,
					    HttpSession session) {
		User user = new User();
		user.setuLoginname(username);
		user.setuPassword(password);
		
		User login = userMapper.login(user);
		
		if(login != null) {
			session.setAttribute("loginName", login.getuName());
			//session.setAttribute("password", password);
			//重定向，防止表单重复提交
			return "redirect:/main.html";
		}
		map.put("message","用户名密码错误！");
		return "login";
	}
}
