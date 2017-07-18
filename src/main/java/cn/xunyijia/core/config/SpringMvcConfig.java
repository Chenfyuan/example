package cn.xunyijia.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by Linweijian on 2017/7/18.
 */
@Configuration
@EnableWebMvc
@ComponentScan("cn.xunyijia")//扫描cn.xunyijia下所有包
public class SpringMvcConfig {
    @Bean
    public InternalResourceViewResolver viewResolver()
    {
        InternalResourceViewResolver v=new InternalResourceViewResolver();
        v.setPrefix("/WEB-INF/classes/views/");
        v.setSuffix(".jsp");
        v.setViewClass(JstlView.class);
        return v;
    }
}
