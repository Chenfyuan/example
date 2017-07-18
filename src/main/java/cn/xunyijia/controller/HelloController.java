package cn.xunyijia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Linweijian on 2017/7/18.
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String hello()
    {
        return "index";
    }
}
