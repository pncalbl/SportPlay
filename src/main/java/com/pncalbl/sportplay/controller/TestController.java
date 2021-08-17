package com.pncalbl.sportplay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pncalbl
 * @date 2021/8/15 23:12
 * @e-mail pncalbl@qq.com
 * @description
 **/

@RestController
public class TestController {

	@RequestMapping("/test")
	public String test() {
		return "Test my TestController!";
	}
}
