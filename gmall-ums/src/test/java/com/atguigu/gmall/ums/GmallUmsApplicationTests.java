package com.atguigu.gmall.ums;

import com.atguigu.gmall.ums.entity.Admin;
import com.atguigu.gmall.ums.service.impl.AdminServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class GmallUmsApplicationTests {

    @Autowired
    private AdminServiceImpl adminService;

    @Test
    void contextLoads() {
        Admin admin = adminService.loginByUsernameAndPassword("admin", "123456");
        System.out.println(admin);
    }

}
