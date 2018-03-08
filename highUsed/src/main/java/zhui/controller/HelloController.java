package zhui.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String index() throws Exception{
        int sleepTime = new Random().nextInt(3000);
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("/hello,host:"+instance.getHost()+",service_id:"+instance.getServiceId());
        Thread.sleep(sleepTime);
        return "hello world";
    }

    @RequestMapping(value = "userQuery")
    @ResponseBody
    public String userQuery(String name){

        return "hello world"+name;

    }
}
