package com.pncalbl.sportplay.service;

import com.pncalbl.sportplay.pojo.MainMenu;

import java.util.List;

/**
 * @author pncalbl
 * @date 2021/8/21 20:33
 * @e-mail pncalbl@qq.com
 * @description 菜单管理服务接口
 **/

public interface MenuService {
	/**
	 * 返回菜单列表
	 * @return 菜单列表
	 */
	List<MainMenu> getMenus();
}
