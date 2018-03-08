//package cn.com.zhui.service.impl;
//
//import cn.com.zhui.service.HelloService;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//public class HelloServiceImpl implements HelloService{
//    @Autowired
//    RestTemplate restTemplate;
//
//    @Override
//    public String helloService() {
//        return restTemplate.getForObject("http://HELLO.SERVICE/hello",String.class);
//    }
//
//    @Override
//    public String userQueryService() {
//        return restTemplate.getForObject("http://HELLO.SERVICE/userQuery?name={1}",String.class,"zhuhui");
//    }
//
//    @Override
//    public String helloFallback() {
//        return "error";
//    }
//}
