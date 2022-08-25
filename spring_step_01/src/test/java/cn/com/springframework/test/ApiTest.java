package cn.com.springframework.test;

import cn.com.springframework.BeanDefinition;
import cn.com.springframework.BeanFactory;
import cn.com.springframework.test.bean.UserService;
import org.junit.Test;


/**
 * @Author yuezp
 * @Date 2022/8/25 下午12:46
 * @Version v1.0
 */
public class ApiTest {

    @Test
    public void test(){

       //初始化beanfactory
        BeanFactory beanFactory = new BeanFactory();

        //注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }
}
