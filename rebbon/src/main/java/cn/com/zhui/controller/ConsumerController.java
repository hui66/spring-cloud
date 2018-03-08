package cn.com.zhui.controller;

import cn.com.zhui.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/ribbon-consumer")
    public String helloController() {
        return helloService.helloService();
    }

    @RequestMapping(value = "/ribbon-userquery")
    public String userQueryController() {
        return helloService.userQueryService();
    }
}
