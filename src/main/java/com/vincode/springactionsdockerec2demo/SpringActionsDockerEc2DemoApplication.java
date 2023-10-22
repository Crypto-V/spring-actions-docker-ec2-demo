package com.vincode.springactionsdockerec2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringActionsDockerEc2DemoApplication {

    @RequestMapping("/api/v1/welcome")
    public String sayHi(){
        return "Hello EC2";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringActionsDockerEc2DemoApplication.class, args);
    }

}
