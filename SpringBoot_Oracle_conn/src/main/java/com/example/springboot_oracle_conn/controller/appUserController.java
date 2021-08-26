package com.example.springboot_oracle_conn.controller;

import com.example.springboot_oracle_conn.bo.appUser;
import com.example.springboot_oracle_conn.services.appUserServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("appuser")
@Slf4j
public class appUserController {

    @Autowired
    private appUserServices appUserServices;

    /**
     *
     *
     * 查询appuser全部数据
     * */
    @GetMapping("queryall")
    public List<appUser> getqueryAll()
    {
        log.info("查询appuser全部数据----------------------");
        log.info("data:{}",appUserServices.queryAll());
        return this.appUserServices.queryAll();
    }

    /**
     *
     * @Param pageno 页数
     * @pararm pagesize 条数
     *
     * 分页查询
     * */
    @GetMapping("queryallpage")
    public List<appUser> getqueryAll(int pageno,int pagesize)
    {
        int start=pageno*pagesize-pagesize;//开始位置
        int end=pageno*pagesize;//结束位置
        log.info("查询appuser全部数据----------------------");
        List<appUser> appUsers = appUserServices.queryAllByPage(start, end);
        log.info("data:{}",appUsers);
        return appUsers;
    }


}
