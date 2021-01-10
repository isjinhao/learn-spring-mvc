package smet.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import smet.config.RootWebAppContextConfig;
import smet.config.ServletWebAppContextConfig;

import javax.servlet.Filter;

/**
 * @Author ISJINHAO
 * @Date 2021/1/8 19:21
 */
public class MyWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 返回Spring应用根容器中定义的beans，对应ContextLoaderListener，是Spring根容器
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootWebAppContextConfig.class};
    }

    /**
     *  返回Spring MVC应用容器中定义的beans，对应DispatcherServlet中加载的bean
     *  Spring MVC容器是根容器的子容器，子容器可以看到根容器中定义的beans，反之不行
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ServletWebAppContextConfig.class};
    }

    /**
     * 指定映射拦截URL
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 修改 通过重写此方法修改DispatcherServlet的名称，对应<servlet-name></servlet-name>标签
     */
    @Override
    protected String getServletName() {
        return super.getServletName();
    }

    @Override
    protected Filter[] getServletFilters() {
        return null;
    }
}