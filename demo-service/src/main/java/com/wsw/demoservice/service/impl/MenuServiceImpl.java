package com.wsw.demoservice.service.impl;

import com.wsw.demoapi.service.MenuService;
import com.wsw.demobase.entity.Hr;
import com.wsw.demobase.entity.Menu;
import com.wsw.demodao.mapper.MenuMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.List;

/**
 * @Author WangSongWen
 * @Date: Created in 17:48 2020/8/24
 * @Description:
 */
@Service(interfaceName = "menuService")
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getMenusByHrId(Integer id) {
        return menuMapper.getMenusByHrId(id);
    }
}
