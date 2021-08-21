package com.pncalbl.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.pncalbl.sportplay.pojo.User;
import com.pncalbl.sportplay.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author pncalbl
 * @date 2021/8/17 21:33
 * @e-mail pncalbl@qq.com
 * @description 登录管理
 **/
@RestController
@Api(tags = "登录管理")
public class LoginController {

	@Autowired
	private UserService userService;


	@ApiOperation("登录")
	@RequestMapping("/login")
	public String login(@RequestBody User user) {
		String flag = "error";
		User us = userService.getUserByMsg(user.getUsername(), user.getPassword());
		System.out.println("user: " + us);
		HashMap<String, Object> res = new HashMap<>();
		if (us != null) {
			flag = "ok";
		}
		res.put("flag", flag);
		res.put("user", us);
		String res_json = JSON.toJSONString(res);
		return res_json;
	}
}
