package me.jeweltot.springboot012.config;

import me.jeweltot.springboot012.Springboot012Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackageClasses = Springboot012Application.class)
public class mybatisConfig
{
}
