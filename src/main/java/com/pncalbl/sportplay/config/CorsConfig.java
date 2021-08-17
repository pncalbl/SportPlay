package com.pncalbl.sportplay.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author pncalbl
 * @date 2021/8/15 23:19
 * @e-mail pncalbl@qq.com
 * @description
 **/

@Configuration
public class CorsConfig implements WebMvcConfigurer {

	/**
	 * 配置跨域请求
	 *
	 * @param registry 跨域策略
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				// 允许的来源, * 代表允许所有来源
				.allowedOrigins("http://localhost:8080", "null")
				.allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
				// 是否允许发送Cookie
				.allowCredentials(true)
				// 本次预检请求的有效期，单位为秒
				.maxAge(3600)
				.allowedHeaders("*");
	}
}