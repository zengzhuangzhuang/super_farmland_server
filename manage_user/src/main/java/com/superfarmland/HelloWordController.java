package com.superfarmland;

import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

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
