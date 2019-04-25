package com.xiaotao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/4/25 22:54
 */
@SpringBootApplication
@EntityScan("com.xiaotao.domain.crm")
@ComponentScan(basePackages = {"com.xiaotao.api.crm"})
@ComponentScan(basePackages = {"model"})
public class CrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class, args);
    }
}
