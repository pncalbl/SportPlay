package com.pncalbl.sportplay.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

/**
 * @author pncalbl
 * @date 2021/8/22 21:34
 * @e-mail pncalbl@qq.com
 * @description
 **/

@Configuration
public class GsonConfig {

	@Bean
	GsonHttpMessageConverter gsonHttpMessageConverter() {
		GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
		GsonBuilder gb = new GsonBuilder();
		Gson gson = gb.setDateFormat("yyyy/MM/dd").create();
		converter.setGson(gson);
		return converter;
	}
}