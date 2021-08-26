package com.example.springboot_oracle_conn.services;

import com.example.springboot_oracle_conn.bo.appUser;
import com.example.springboot_oracle_conn.dao.appUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("appUserServices")
public class appUserServiceimpl implements appUserServices{
    /**
     * 服务对象
     * */
    @Autowired
    private appUserDao appUserDao;

    @Override
    public List<appUser> queryAll() {
        return this.appUserDao.queryAll();
    }

    @Override
    public List<appUser> queryAllByPage(int start, int end) {
        return this.appUserDao.queryAllByPage(start, end);
    }

    @Override
    public int insert(appUser appUser) {
        return this.appUserDao.insert(appUser);
    }

    @Override
    public int update(appUser appUser) {
        return this.appUserDao.update(appUser);
    }

    @Override
    public int delete(Integer id) {
        return this.appUserDao.delete(id);
    }
}
