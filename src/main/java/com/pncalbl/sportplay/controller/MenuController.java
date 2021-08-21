package com.pncalbl.sportplay.controller;

import com.alibaba.fastjson.JSON;
import com.pncalbl.sportplay.pojo.MainMenu;
import com.pncalbl.sportplay.service.MenuService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @author pncalbl
 * @date 2021/8/18 21:45
 * @e-mail pncalbl@qq.com
 * @description 菜单栏管理
 **/

@RestController
@Api(tags = "菜单栏管理")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@RequestMapping("/menus")
	public String getAllMenus() {
		System.out.println("访问成功");
		HashMap<String, Object> data = new HashMap<>();
		int status = 404;  // 错误 404 成功 200
		List<MainMenu> menus = menuService.getMenus();
		if (menus != null) {
			data.put("data", menus);
			status = 200;
		}
		data.put("status", status);
		String s = JSON.toJSONString(data);
		return s;
	}
}
