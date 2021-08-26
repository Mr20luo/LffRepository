package com.example.springboot_oracle_conn.services;

import com.example.springboot_oracle_conn.bo.appUser;

import java.util.List;

public interface appUserServices {

    /**
     * 查询全部数据
     * */
    public List<appUser> queryAll();


    /**
     * 分页查询
     * */
    public List<appUser> queryAllByPage(int start,int end);

    /**
     * 新增
     *
     * @return*/
    public int insert(appUser appUser);

    /**
     * 新增
     *
     * @return*/
    public int update(appUser appUser);


    /**
     * 删除
     * */
    public int delete(Integer id);
}
