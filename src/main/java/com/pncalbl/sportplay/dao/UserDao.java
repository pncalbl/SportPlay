package com.pncalbl.sportplay.dao;

import com.pncalbl.sportplay.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author pncalbl
 * @date 2021/8/17 22:02
 * @e-mail pncalbl@qq.com
 * @description 用户数据访问
 **/

@Repository
public interface UserDao {
	public User getUserByMsg(@Param("username") String username, @Param("password") String password);
}
