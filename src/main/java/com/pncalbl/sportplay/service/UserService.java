package com.pncalbl.sportplay.service;

import com.pncalbl.sportplay.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author pncalbl
 * @date 2021/8/21 20:33
 * @e-mail pncalbl@qq.com
 * @description 登录管理服务接口
 **/

public interface UserService {
	/**
	 * 通过用户名和密码查询用户是否存在
	 * @param username 用户名
	 * @param password 密码
	 * @return 用户对象 / null
	 */
	User getUserByMsg(@Param("username") String username, @Param("password") String password);
}
