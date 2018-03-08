package cn.com.zhui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class springMuster {
    public static void main(String[] args) {
        SpringApplication.run(springMuster.class,args);
    }
}
