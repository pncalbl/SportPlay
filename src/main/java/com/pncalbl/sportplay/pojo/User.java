package com.pncalbl.sportplay.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author pncalbl
 * @date 2021/8/17 21:28
 * @e-mail pncalbl@qq.com
 * @description 用户实体类
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@ApiModelProperty(value = "ID", hidden = true)
	private int id;

	@ApiModelProperty(value = "用户名称")
	private String username;

	@ApiModelProperty(value = "用户密码")
	private String password;

	@ApiModelProperty(value = "邮箱")
	private String email;

	@ApiModelProperty(value = "用户角色")
	private String role;

	@ApiModelProperty(value = "用户状态")
	private boolean state;

	public boolean getState() {
		return state;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(id, user.id) &&
				Objects.equals(username, user.username);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username);
	}
}
