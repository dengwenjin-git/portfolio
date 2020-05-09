package com.dengwenjin.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 邓文晋
 * @Description 〈作品集〉
 * @create 2020/4/12 0012 1:36
 * @since 1.0
 */
@Controller
public class PortfolioController {

    //地球
    @RequestMapping("earth")
    String earth(){
        return "earth/index";
    }

    //爱
    @RequestMapping("love")
    String love(){
        return "love/index";
    }

    //千纸鹤
    @RequestMapping("paperCrane")
    String paperCrane(){
        return "paperCrane/index";
    }

    //旋转相册
    @RequestMapping("photo")
    String photo(){
        return "photo/index";
    }

    //彩蝶
    @RequestMapping("butterfly")
    String butterfly(){
        return "butterfly/index";
    }

    //时钟
    @RequestMapping("clock")
    String clock(){
        return "clock/index";
    }

    //花瓣
    @RequestMapping("petal")
    String petal(){
        return "petal/index";
    }

    //纸飞机
    @RequestMapping("paperPlane")
    String paperPlane(){
        return "paperPlane/index";
    }

    //翻滚
    @RequestMapping("roll")
    String roll(){
        return "roll/index";
    }

    //点名
    @RequestMapping("callRoll")
    String callRoll(){
        return "callRoll/index";
    }
}