package com.pncalbl.sportplay.dao;

import com.pncalbl.sportplay.pojo.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author pncalbl
 * @date 2021/8/18 21:34
 * @e-mail pncalbl@qq.com
 * @description 菜单数据访问
 **/

@Repository
public interface MenuDao {
	/**
	 * 返回菜单列表
	 * @return 菜单列表
	 */
	List<MainMenu> getMenus();
}
