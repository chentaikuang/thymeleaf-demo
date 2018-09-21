package com.xiaochen.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/html")
public class HtmlController {

    @RequestMapping("/test")
    public String test(HashMap<String, Object> map) {
        String str = "<p><br/></p><p><img src=\"http://img01.sys.iflashbuy.com:8282/group2/M00/00/60/wKgFZFrz3SeAXtrkAAAtOnXUqbE499.jpg\" alt=\"图片\"/><img src=\"http://img01.sys.iflashbuy.com:8282/group2/M00/07/7D/wKgF-lrz3TGAJF0JAAfT1R93j9g679.jpg\" alt=\"图片\"/><img src=\"http://img01.sys.iflashbuy.com:8282/group2/M00/00/60/wKgFZFrz3TSAANcGAAhdEvHo5tc457.jpg\" alt=\"图片\"/><img src=\"http://img01.sys.iflashbuy.com:8282/group2/M00/07/7D/wKgF-lrz3TiAXYdzAAlVC8srH-4057.jpg\" alt=\"图片\"/><img src=\"http://img01.sys.iflashbuy.com:8282/group2/M00/00/60/wKgFZFrz3TyAbaBoAAn9LyPeGU4365.jpg\" alt=\"图片\"/></p><p><br/></p><p><br/></p>";
        map.put("hello", "这里是HTML页面,使用thymeleaf");
        map.put("desc", str);
        return "/index";
    }

    @RequestMapping("/test2")
    public String test2(Model model) throws Exception {
        String str = "<p>我是小臣，这是demo</p><br />";
        model.addAttribute("desc", str);
        model.addAttribute("hello", "h5");
        return "/index";
    }
}