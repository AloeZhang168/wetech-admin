package tech.wetech.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "tech.wetech.admin.mapper")
public class MyBatisConfig {

}
