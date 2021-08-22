package com.pncalbl.sportplay.config;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author pncalbl
 * @date 2021/8/15 23:17
 * @e-mail pncalbl@qq.com
 * @description
 **/

@Configuration
public class WebConfig implements WebMvcConfigurer {

	/**
	 * Gson 配置
	 *
	 * @return 消息转换器
	 */
	@Bean
	GsonHttpMessageConverter gsonHttpMessageConverter() {
		GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
		GsonBuilder gb = new GsonBuilder();
		Gson gson = gb.create();
		converter.setGson(gson);
		return converter;
	}

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
