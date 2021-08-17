package com.pncalbl.sportplay.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pncalbl
 * @date 2021/8/15 23:12
 * @e-mail pncalbl@qq.com
 * @description
 **/

@RestController
@Api(tags = "测试管理")
public class TestController {

	@ApiOperation("测试")
	@RequestMapping("/test")
	public String test() {
		return "Test my TestController!";
//		return "ok";
	}
}
