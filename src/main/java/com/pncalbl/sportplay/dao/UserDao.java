package com.pncalbl.sportplay.dao;

import com.pncalbl.sportplay.pojo.User;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author pncalbl
 * @date 2021/8/17 22:02
 * @e-mail pncalbl@qq.com
 * @description 用户数据访问
 **/

@Repository
public interface UserDao {

	/**
	 * 通过用户名和密码查询用户是否存在
	 *
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
	 * 获取所有的用户总数
	 *
	 * @param username 用户名
	 * @return 用户总数数
	 */
	Integer getUserCounts(@Param("username") String username);

	/**
	 * 更改用户状态
	 *
	 * @param id    用户 id
	 * @param state 用户状态: 0-无效,1-有效
	 * @return 受影响的行数
	 */
	int updateState(Integer id, Boolean state);

	/**
	 * 添加用户
	 *
	 * @param user 用户对象
	 * @return 受影响的行数
	 */
	int addUser(User user);

	/**
	 * 删除用户
	 *
	 * @param id user Id
	 * @return 受影响的行数
	 */
	int deleteUser(int id);

	/**
	 * 获取用户对象
	 *
	 * @param id user Id
	 * @return 受影响的行数
	 */
	User getUpdateUser(int id);

	/**
	 * 修改用户
	 *
	 * @param user 用户对象
	 * @return 受影响的行数
	 */
	int editUser(User user);
}
