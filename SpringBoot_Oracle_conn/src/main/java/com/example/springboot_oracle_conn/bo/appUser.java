package com.example.springboot_oracle_conn.bo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class appUser {
    private Integer id;
    private String name;
    private int age;
    private String adress;
}
