package com.pncalbl.sportplay.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pncalbl
 * @date 2021/8/21 21:32
 * @e-mail pncalbl@qq.com
 * @description
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryInfo {
	@ApiModelProperty(value = "查询信息即: username")
	private String query;
	@ApiModelProperty(value = "当前页")
	private int pageNum;
	@ApiModelProperty(value = "页面大小")
	private int pageSize;
}
