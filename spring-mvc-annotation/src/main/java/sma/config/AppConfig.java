package sma.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import smc.domain.User;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author ISJINHAO
 * @Date 2020/12/29 20:21
 */
@ComponentScan({"sma.controller"})
public class AppConfig {
    @Bean
    public User user() {
        return new User();
    }

    @Bean
    public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {

        RequestMappingHandlerAdapter mappingHandlerAdapter = new RequestMappingHandlerAdapter();

        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));

        List<HttpMessageConverter<?>> list = new ArrayList<>();
        list.add(converter);

        mappingHandlerAdapter.setMessageConverters(list);

        return mappingHandlerAdapter;
    }

}
