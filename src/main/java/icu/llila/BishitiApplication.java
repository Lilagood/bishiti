package icu.llila;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "icu.llila.money.mapper")
public class BishitiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BishitiApplication.class, args);
    }

}
