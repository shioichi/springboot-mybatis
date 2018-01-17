package com.chinabigdata.config;


import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;



/**
 * //@MapperScan(basePackages = SessionFactoryConfig.PACKAGE)
 *
 * @author chenpengjiang
 */
@Configuration
@AutoConfigureAfter(SessionFactoryConfig.class)
public class MyBatisMapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.chinabigdata.dao");

        return mapperScannerConfigurer;
    }
}
