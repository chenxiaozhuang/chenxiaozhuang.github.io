package com.tckj.tckj.LongUser.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class sysUser implements Serializable {
    private int id;
    private String name;
    private String password;
    private String perms;

}
