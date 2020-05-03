package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Test
    public void contextLoads() {
        Product byId = productService.getById(1);
        System.out.println(byId.getName());

    }

}
