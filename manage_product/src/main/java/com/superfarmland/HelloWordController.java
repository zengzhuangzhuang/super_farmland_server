package com.superfarmland;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
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


    // 消费监听
    //@KafkaListener(topics = {"topic.test"})
    public void onMessage1(ConsumerRecord<?, ?> record, Consumer consumer){
        // 消费的哪个topic、partition的消息,打印出消息内容
        System.out.println("简单消费："+record.topic()+"-"+record.partition()+"-"+record.value());
        consumer.commitAsync();
    }

    @Resource
    private UserFeignTest userFeignTest;

    //测试feign的调用
    @RequestMapping("/helloWordForFeign")
    @ResponseBody
    public String helloWordForFeign(){
        String info = userFeignTest.hellowordForFeign();
        return info;
    }


}
