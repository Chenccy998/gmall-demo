package com.atguigu.gmall.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
 * 1、不进行数据源的自动配置
 * 如果导入的依赖引入一个自动配置的场景：
 *     1）这个场景自动配置默认生效，我们就必须配置这个注解
 *     2）不想配置
 *        引入的时候排除这个场景的依赖
 *        排除掉这个场景的自动配置类
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GmallAdminWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallAdminWebApplication.class, args);
    }

}
