package com.zxp.swagger.controller;

import com.zxp.swagger.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 作者 zxp
 * 创建时间 2018/9/27/027
 * 交流群 897841829
 */
@Api
@RestController
public class TestController {

    @ApiOperation(value = "测试使用例子", notes = "返回如输入文本")
    @GetMapping("test1")
    public String test(String name) {
        return name;
    }
    @ApiOperation(value = "测试使用例子1", notes = "返回如输入文本2")
    @ApiImplicitParam(name = "name", value = "单个用户信息", dataType = "String")
    @GetMapping("test2")
    public String test2(String name) {
        return name;
    }
    @ApiOperation(value = "测试使用例子3", notes = "返回输入对象")
    @GetMapping("test3")
    public User test3(User user) {
        return user;
    }
    @ApiOperation(value = "测试使用例子4", notes = "返回输入对象")
    @PostMapping("test4")
    public List<User> test4(@RequestBody List<User> users) {
        return users;
    }


}
