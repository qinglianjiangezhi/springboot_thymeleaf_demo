package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @Auther: sqy
 * @Date: 2021/1/28 12:45
 * @Description:
 */
@Controller
public class FirstThymeleafController {

    @RequestMapping("/index01")
    public String index01(Model model){
        model.addAttribute("message","my first ThymeleafDemo");
        return "index01";
    }

    @RequestMapping("/index02")
    public String index02(Model model){
        User user = new User(1,"张三",36);

        Map<String, Object> map = new HashMap<>();
        map.put("id",2);
        map.put("name","李四");
        map.put("gender","男");
        model.addAttribute("map",map);
        model.addAttribute("user",user);
        return "index02";
    }

    @RequestMapping("/index03")
    public String index03(Model model){
        User user1 = new User(1,"张三",36);
        User user2 = new User(2,"李四",48);
        User user3 = new User(3,"王五",56);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("list",list);
        return "index03";
    }

    @RequestMapping("/index04")
    public String index04(Model model){
        model.addAttribute("message","欢迎来到北京");
        return "index04";
    }

    @RequestMapping("/index05")
    public String index05(Model model){
        model.addAttribute("flag","no");
        model.addAttribute("menu","manager");
        model.addAttribute("manager","manager");
        return "index05";
    }

    @RequestMapping("/index06")
    public String index06(Model model){
        model.addAttribute("message","红莲公主");
        return "index06";
    }

    @RequestMapping("/index07")
    public String index07(Model model){
        model.addAttribute("date",new Date());
        model.addAttribute("number",1234.5678);
        String str = "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
        model.addAttribute("str",str);
        return "index07";
    }

    @RequestMapping("/index08")
    public String index08(){
        return null;
    }

}
