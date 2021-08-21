package com.pncalbl.sportplay.pojo;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.License;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author pncalbl
 * @date 2021/8/18 21:30
 * @e-mail pncalbl@qq.com
 * @description 主导航
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MainMenu {
	@ApiModelProperty(value = "ID", hidden = true)
	private int id;
	@ApiModelProperty(value = "标题")
	private String title;
	@ApiModelProperty(value = "访问路径")
	private String path;
	@ApiModelProperty(value = "分支菜单列表")
	private List<SubMenu> subList;
}
