package com.pncalbl.sportplay.service.impl;

import com.pncalbl.sportplay.dao.UserDao;
import com.pncalbl.sportplay.pojo.User;
import com.pncalbl.sportplay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pncalbl
 * @date 2021/8/21 20:35
 * @e-mail pncalbl@qq.com
 * @description 登录管理服务实现类
 **/

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User getUserByMsg(String username, String password) {
		return userDao.getUserByMsg(username, password);
	}
}
