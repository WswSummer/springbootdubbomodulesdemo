package com.wsw.demoapi.service;

import com.wsw.demobase.entity.Menu;

import java.util.List;

/**
 * @Author WangSongWen
 * @Date: Created in 17:47 2020/8/24
 * @Description:
 */
public interface MenuService {
    List<Menu> getMenusByHrId(Integer id);
}
