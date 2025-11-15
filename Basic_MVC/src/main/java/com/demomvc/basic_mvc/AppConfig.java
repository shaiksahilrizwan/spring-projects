package com.demomvc.basic_mvc;

import com.demomvc.basic_mvc.DB.DBConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.demomvc.basic_mvc")
public class AppConfig {
//    @Bean(initMethod = "init")
//    public DBConnection dbConnection(){
//        return new DBConnection();
//    }
}
