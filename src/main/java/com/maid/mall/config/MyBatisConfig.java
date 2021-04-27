package com.maid.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName com.maid.mall.config.mbgConfig
 * @Description
 * @Author Maid
 * @Date 2021/4/27 0027 23:50
 * @Version v1.0
 */

@Configuration
@MapperScan("com.maid.mall.mbg.mapper")
public class MyBatisConfig {
  public static void main(String[] args) {

  }
}
