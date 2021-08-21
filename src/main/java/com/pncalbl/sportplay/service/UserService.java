package com.pncalbl.sportplay.service;

import com.pncalbl.sportplay.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

	/**
	 * 查询用户列表
	 *
	 * @param username  模糊查询的用户名
	 * @param pageStart 分页参数: 开始页
	 * @param pageSize  分页参数: 页面大小
	 * @return 用户列表
	 */
	List<User> getAllUser(@Param("username") String username, @Param("pageStart") int pageStart, @Param("pageSize") int pageSize);

	/**
	 * 获取用户总数
	 * @param username 用户名
	 * @return 用户总数
	 */
	Integer getUserCounts(@Param("username") String username);
}
