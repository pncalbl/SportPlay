package com.pncalbl.sportplay.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pncalbl
 * @date 2021/8/18 21:27
 * @e-mail pncalbl@qq.com
 * @description 分支导航
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubMenu {
	@ApiModelProperty(value = "ID", hidden = true)
	private int id;
	@ApiModelProperty(value = "标题")
	private String title;
	@ApiModelProperty(value = "访问路径")
	private String path;
}
