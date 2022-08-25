package cn.com.springframework.test;

import cn.com.springframework.beans.factory.config.BeanDefinition;
import cn.com.springframework.beans.factory.support.DefaultListableBeanfactory;
import cn.com.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @Author yuezp
 * @Date 2022/8/25 下午6:34
 * @Version v1.0
 */
public class ApiTest {

    @Test
    public void test(){

        //1.初始化beanfactory
        DefaultListableBeanfactory beanfactory = new DefaultListableBeanfactory();
        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanfactory.registerBeanDefinition("userService", beanDefinition);
        //3.第一次获取bean
        UserService userService = (UserService)beanfactory.getBean("userService");
        userService.queryUserInfo();
        //4.第二次获取bean
        UserService service = (UserService)beanfactory.getBean("userService");
        service.queryUserInfo();
        System.out.println(userService == service);

    }
}
