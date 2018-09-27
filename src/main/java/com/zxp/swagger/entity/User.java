package com.zxp.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 作者 zxp
 * 创建时间 2018/9/27/027
 * 交流群 897841829
 */
@ApiModel
public class User {

    private String name;
    private String password;
    @ApiModelProperty(hidden = true)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {

    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

}
