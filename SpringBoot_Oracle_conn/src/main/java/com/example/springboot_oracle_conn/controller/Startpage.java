package com.example.springboot_oracle_conn.controller;

import com.example.springboot_oracle_conn.bo.appUser;
import com.example.springboot_oracle_conn.services.appUserServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Slf4j
public class Startpage {

    @Autowired
    private appUserServices appUserServices;

    /**
     *
     * @Param pageno 页数
     * @pararm pagesize 条数
     *
     * 分页查询
     * */
    public List<appUser> getqueryAll(int pageno,int pagesize)
    {
        int start=pageno*pagesize-pagesize;//开始位置
        int end=pageno*pagesize;//结束位置
        log.info("查询appuser分页数据----------------------");
        List<appUser> appUsers = appUserServices.queryAllByPage(start, end);
        log.info("data:{}",appUsers);
        return appUsers;
    }

    /**
     *
     *
     * 起始页
     * */
    @RequestMapping("startpage")
    public String queryallpage(Model model)
    {
        List<appUser> appUsers = getqueryAll(1, 10);
        model.addAttribute("appusers",appUsers);
        return "index";
    }

    /**
     *
     *
     * 起始页
     * */
    @RequestMapping("/startpage1")
    public ModelAndView queryallpage()
    {
        List<appUser> appUsers = getqueryAll(1, 10);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("apps",appUsers);
        return modelAndView;
    }
}
