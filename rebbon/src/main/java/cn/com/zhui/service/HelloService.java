package cn.com.zhui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

//    @HystrixCommand(fallbackMethod = "helloFallback")
//    String helloService();
//
//    @HystrixCommand(fallbackMethod = "helloFallback")
//    String userQueryService();
//
//    String helloFallback();

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        return restTemplate.getForObject("http://HELLO.SERVICE/hello",String.class);
    }
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String userQueryService() {
        return restTemplate.getForObject("http://HELLO.SERVICE/userQuery?name={1}",String.class,"zhuhui");
    }

    public String helloFallback() {
        return "error";
    }
}
