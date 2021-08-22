package com.pncalbl.sportplay.controller;

import com.google.gson.Gson;
import com.pncalbl.sportplay.pojo.QueryInfo;
import com.pncalbl.sportplay.pojo.User;
import com.pncalbl.sportplay.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @author pncalbl
 * @date 2021/8/21 21:27
 * @e-mail pncalbl@qq.com
 * @description 用户管理
 **/

@RestController
@Api(tags = "用户管理")
public class UserController {
	@Resource
	private UserService userService;

	@Resource
	private Gson gson;

	@RequestMapping("/allUser")
	public String getUserList(QueryInfo queryInfo) {
		System.out.println(queryInfo);
		int numbers = userService.getUserCounts("%" + queryInfo.getQuery() + "%");// 获取数据总数
		int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
		List<User> users = userService.getAllUser("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
		HashMap<String, Object> res = new HashMap<>();
		res.put("numbers", numbers);
		res.put("data", users);
		System.out.println("总条数：" + numbers);
		return gson.toJson(res);
	}

	@RequestMapping("/")
	public String updateUserState(@RequestParam("id") Integer id, @RequestParam("state") Boolean state) {
		return "ok";
	}
}
