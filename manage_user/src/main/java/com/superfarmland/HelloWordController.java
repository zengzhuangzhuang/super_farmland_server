package com.superfarmland;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/HelloWordController")
public class HelloWordController {

    @Resource
    private KafkaTemplate<String, Object> kafkaTemplate;

    //测试链接 http://localhost:17770/manage_user/HelloWordController/helloword
    @RequestMapping("/helloword")
    @ResponseBody
    public String helloWordFunc(){
        kafkaTemplate.send("topic.test","djasidhaidalsdadjoa");
        return "JAVA世界欢迎你。";
    }

    @RequestMapping("/hellowordForFeign")
    @ResponseBody
    public String hellowordForFeign(){
        return "JAVA世界欢迎你。Feign";
    }

}
