package com.pncalbl.sportplay.service.impl;

import com.pncalbl.sportplay.dao.UserDao;
import com.pncalbl.sportplay.pojo.User;
import com.pncalbl.sportplay.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pncalbl
 * @date 2021/8/21 20:35
 * @e-mail pncalbl@qq.com
 * @description 登录管理服务实现类
 **/

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public User getUserByMsg(String username, String password) {
		return userDao.getUserByMsg(username, password);
	}

	@Override
	public List<User> getAllUser(String username, int pageStart, int pageSize) {
		return userDao.getAllUser(username, pageStart, pageSize);
	}

	@Override
	public Integer getUserCounts(String username) {
		return userDao.getUserCounts(username);
	}

	@Override
	public int updateState(Integer id, Boolean state) {
		return userDao.updateState(id, state);
	}

	@Override
	public int addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public int deleteUser(int id) {
		return userDao.deleteUser(id);
	}

	@Override
	public User getUpdateUser(int id) {
		return userDao.getUpdateUser(id);
	}

	@Override
	public int editUser(User user) {
		return userDao.editUser(user);
	}

}
