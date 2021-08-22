package com.pncalbl.sportplay.service.impl;

import com.pncalbl.sportplay.dao.MenuDao;
import com.pncalbl.sportplay.pojo.MainMenu;
import com.pncalbl.sportplay.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pncalbl
 * @date 2021/8/21 20:36
 * @e-mail pncalbl@qq.com
 * @description 菜单管理服务实现类
 **/

@Service
public class MenuServiceImpl implements MenuService {

	@Resource
	private MenuDao menuDao;

	@Override
	public List<MainMenu> getMenus() {
		return menuDao.getMenus();
	}
}
