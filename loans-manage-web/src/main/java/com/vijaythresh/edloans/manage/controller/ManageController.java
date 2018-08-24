package com.vijaythresh.edloans.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @RequestMapping("queryRepaymentDetail")
    public String toQueryRepaymentDetail(HttpServletRequest request) {
        String loanContractNum = request.getParameter("loanContractNum");
        NplmLoanContract nplmLoanContract = contractService.getRepayContract(loanContractNum);
        return "common/查看还款情况页面";
    }

    @RequestMapping("逾期列表")
    public String toOverduePage() {
        return "逾期列表/逾期列表";
    }

    /**
     * 获取分页数据，我是将查询以及分页全部写在一个接口里面，然后根据动态sql去查询数据
     * @param map
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getContractPagination",method = RequestMethod.POST)
    public Object getContractPagination(@RequestParam Map<String,Object> map) {
        //根据传递参数进行分页查询，如果有筛选条件就筛选查询
        map.put("page",Integer.parseInt((String)map.get("page")) - 1);
        map.put("rows",Integer.parseInt((String)map.get("rows")));
        //查询分页结果
        List<NplmLoanContract> list = contractService.getContractPagination(map);
        //查询数据总数
        Long contractNum = contractService.getContractNum(map);
        HashMap<Object, Object> response = new HashMap<>( );
        //封装响应数据，rows，total
        response.put("rows",list);
        response.put("total",contractNum);
        return response;
    }
}
