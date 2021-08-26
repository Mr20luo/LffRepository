package com.example.springboot_oracle_conn;

import com.example.springboot_oracle_conn.bo.appUser;
import com.example.springboot_oracle_conn.dao.appUserDao;
import com.example.springboot_oracle_conn.services.appUserServices;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class SpringBootOracleConnApplicationTests {

    @Autowired
    private com.example.springboot_oracle_conn.services.appUserServices appUserServices;

    /**
     * 服务对象
     * */
    @Autowired
    private com.example.springboot_oracle_conn.dao.appUserDao appUserDao;

    @Test
    void contextLoads() {

        List<appUser> appUsers = appUserServices.queryAllByPage(1, 5);
        log.info("data:{}",appUsers);


    }

    @Test
    public void insert() {
        appUser appUser=new appUser();
        appUser.setId(10800);
        appUser.setName("胜多负少");
        appUser.setAdress("重庆是");
        appUser.setAge(22);
        int insert = appUserDao.insert(appUser);
        log.info("inset:{}",insert);
    }

    @Test
    public void update() {
        appUser appUser=new appUser();
        appUser.setId(10800);
        appUser.setName("henqiguai");
        appUser.setAdress("重庆是");
        appUser.setAge(22);
        int update = appUserServices.update(appUser);
        log.info("update:{}",update);
    }

    @Test
    public void delete() {
        Integer id=10800;
        int delete = appUserDao.delete(id);
        log.info("delete:{}",delete);
    }

}
