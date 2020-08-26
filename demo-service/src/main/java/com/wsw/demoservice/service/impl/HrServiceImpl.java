package com.wsw.demoservice.service.impl;

import com.wsw.demoapi.service.HrService;
import com.wsw.demobase.entity.Hr;
import com.wsw.demodao.mapper.HrMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @Author WangSongWen
 * @Date: Created in 17:50 2020/8/24
 * @Description:
 */
@Service(interfaceName = "hrService")
public class HrServiceImpl implements HrService {
    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if (hr == null){
            throw new UsernameNotFoundException("用户名不存在!");
        }
        return hr;
    }
}
