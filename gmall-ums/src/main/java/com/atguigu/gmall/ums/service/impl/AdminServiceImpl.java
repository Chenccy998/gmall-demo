package com.atguigu.gmall.ums.service.impl;

import com.atguigu.gmall.ums.entity.Admin;
import com.atguigu.gmall.ums.mapper.AdminMapper;
import com.atguigu.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Chenccy
 * @since 2020-04-29
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Override
    public Admin login(String username, String password) {
        return null;
    }
}
