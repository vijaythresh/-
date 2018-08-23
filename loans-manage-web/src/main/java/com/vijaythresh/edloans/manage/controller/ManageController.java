package com.vijaythresh.edloans.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageController {

    @RequestMapping("index")
    public String index() {
        //  视图 spring boot 默认返回thymeleaf 页面
        return "index";
    }

    @RequestMapping("fangkuanliebiao")
    public String getFangKuanLieBiao() {

        return "fangkuanliebiao";
    }

    @RequestMapping("hetongliebiao")
    public String getHeTongLieBiao() {

        return "hetongliebiao";
    }

    @RequestMapping("qianqifeiyongchaxun")
    public String getQianQiFeiYongChaXun() {

        return "qianqifeiyongchaxun";
    }

    @RequestMapping("biangengfeiyong")
    public String getBianGengFeiYong() {

        return "biangengfeiyong";
    }

    @RequestMapping("daihuankuan")
    public String getDaiHuanKuan() {

        return "daihuankuan";
    }

    @RequestMapping("yuqi")
    public String getYuQi() {

        return "yuqi";
    }

    @RequestMapping("yihuankuan")
    public String getYiHuanKuan() {

        return "yihuankuan";
    }

    @RequestMapping("koukuanjieguo")
    public String getKouKuanJieGuo() {

        return "koukuanjieguo";
    }

    @RequestMapping("xintuokoukuanmingxi")
    public String getXinTuoKouKuanMingXi() {

        return "xintuokoukuanmingxi";
    }
}
