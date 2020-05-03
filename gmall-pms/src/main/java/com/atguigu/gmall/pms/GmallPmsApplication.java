package com.atguigu.gmall.pms;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.配置整合dubbo
 *   导入dubbo、zookeeper(排除自带的log4j的jar)相关maven依赖
 *   在application.yaml中添加dubbo相关信息
 *   service层标注dubbo的@service注解用于暴露服务接口
 *   远程调用接口时，使用@reference注解
 *   主启动类中添加@EnableDubbo注解
 *
 * 2.配置整合MybatisPlus
 *   导入MybatisPlus相关maven依赖(MybatisPlus中自带Hikari数据源)
 *   复制修改一下CodeGenerator.java类
 *   将生成的bean、接口放入api服务中，serviceImpl及mapper放入对应服务中
 *
 * 3.配置主从表
 *   maven导入shardingjdbc依赖包
 *   在服务模块中添加数据源配置类(MasterSlaveDataSourceFactory)
 *   将shardingjdbc.yaml配置文件放到resources下
 *
 * 4.dubbo配置ELK
 *   按照文档规则下载安装配置elasticsearch
 *   按照文档规则下载安装配置kibana，版本号和elasticsearch保持一致
 *   按照文档规则下载安装配置logstash，es的版本如果是5.x的话就选择5.x的版本
 *       将logback-spring.xml配置文件放入resources下并修改DEBUG级别以及ip地址
 */

@EnableDubbo
@MapperScan(basePackages = "com.atguigu.gmall.pms.mapper")
@SpringBootApplication
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}
