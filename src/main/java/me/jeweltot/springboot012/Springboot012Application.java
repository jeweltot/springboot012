package me.jeweltot.springboot012;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "me.jeweltot.springboot012")
public class Springboot012Application
{

    public static void main(String[] args)
    {
        SpringApplication.run(Springboot012Application.class, args);
    }

}
