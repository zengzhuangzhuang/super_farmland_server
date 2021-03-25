package com.superfarmland;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWordController")
public class HelloWordController {

    //测试链接 http://localhost:17770/manage_user/HelloWordController/helloword
    @RequestMapping("/helloword")
    @ResponseBody
    public String helloWordFunc(){
        return "JAVA世界欢迎你。";
    }

}
