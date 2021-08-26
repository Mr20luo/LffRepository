package com.example.springboot_oracle_conn.dao;

import com.example.springboot_oracle_conn.bo.appUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface appUserDao {

    /**
     * 查询全部数据
     * */
    public List<appUser> queryAll();


    /**
     * 分页查询
     * */
    public List<appUser> queryAllByPage(@Param("start") int start,@Param("end") int end);

    /**
     * 新增
     * */
    public int insert(appUser appUser);

    /**
     * 新增
     * */
    public int update(appUser appUser);


    /**
     * 删除
     * */
    public int delete(Integer id);
}
