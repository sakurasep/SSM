package top.sakurasep.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.sakurasep.springboot.intercsptor.LoginInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override // 增加拦截器的方法重写
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/user/**"); // 拦截user路径下的请求
    }
}
