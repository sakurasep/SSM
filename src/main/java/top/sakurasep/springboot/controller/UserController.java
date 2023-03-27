package top.sakurasep.springboot.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import top.sakurasep.springboot.entity.User;

@RestController
public class UserController {
    @ApiOperation("获取用户信息")
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id){
       return "通过id 获取用户的信息";
    }

    @PostMapping("/user")
    public String addUser(User user){
        return "添加用户";
    }

    @PutMapping("/user")
    public String updateUser(User user){
        return "更新用户";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable int id){
        return "根据id删除用户信息";
    }
}
