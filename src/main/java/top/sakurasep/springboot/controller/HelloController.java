package top.sakurasep.springboot.controller;

import org.springframework.web.bind.annotation.*;
import top.sakurasep.springboot.entity.User;

@RestController // 控制器
public class HelloController {
    // http://localhost:8080/method1?nickname=zhangsan&phone=123
    // http://localhost:8080/method2?nickname=zhangsan&phone=123
    // http://localhost:8080/method3?name=zhangsan&phone=123
    // http://localhost:8080/method4
    // http://localhost:8080/method6/dada/dadaweq/qeqwe4
    @GetMapping("/method1")// 等价于 @GetMapping("/method1")
    public String method1(String nickname, String phone) {
        System.out.println("phone: " + phone);
        System.out.println("nickname: " + nickname);
        return "你好 世界";
    }

    @GetMapping("/method2") // 该方法测试RequestParam映射
    public String method2(@RequestParam(value = "nickname", required = false) String name, String phone) {
        System.out.println("phone: " + phone);
        System.out.println("name: " + name);
        return "你好 世界";
    }

    // 浏览器地址栏发送的是GET类型

    @PostMapping("/method3") // 该方法测试post请求传参
    public String method3(String name, String phone){
        System.out.println("phone: " + phone);
        System.out.println("name: " + name);
        return "post请求测试";
    }

    @PostMapping("/method4") // 该方法测试post请求传入User对象
    public String method4(User user){
        System.out.println(user);
        return "post请求测试";
    }

    @PostMapping("/method5") // 该方法测试post请求使用json传入
    public String method5(@RequestBody User user){
        System.out.println(user);
        return "post请求测试";
    }

    @GetMapping("/method6/**")
    public String method6(){
        return "通配符请求";
    }
}
