package com.wsw.demoweb.controller;

import com.wsw.demoapi.service.MenuService;
import com.wsw.demobase.entity.Hr;
import com.wsw.demobase.entity.Menu;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WSW
 * @date 2020/5/6 16:31
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    @Reference
    MenuService menuService;

    @GetMapping("/menu")
    public List<Menu> getMenusByHrId(){
        Integer id = ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
        return menuService.getMenusByHrId(id);
    }
}
