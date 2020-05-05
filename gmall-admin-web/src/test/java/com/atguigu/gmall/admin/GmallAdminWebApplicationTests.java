package com.atguigu.gmall.admin;

import com.atguigu.gmall.ums.entity.Admin;
import com.atguigu.gmall.ums.service.AdminService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallAdminWebApplicationTests {

    @Reference
    private AdminService adminService;
    @Test
    void contextLoads() {
        Admin admin = adminService.loginByUsernameAndPassword("admin", "123456");
        System.out.println(admin);
    }

}
