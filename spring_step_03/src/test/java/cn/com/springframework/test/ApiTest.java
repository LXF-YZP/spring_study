package cn.com.springframework.test;

import cn.com.springframework.beans.factory.config.BeanDefinition;
import cn.com.springframework.beans.factory.support.DefaultListableBeanfactory;
import cn.com.springframework.test.bean.UserInfoService;
import org.junit.Test;

/**
 * @Author yuezp
 * @Date 2022/8/26 上午11:00
 * @Version v1.0
 */
public class ApiTest {

    @Test
    public void test(){
        //初始化beanfactory
        DefaultListableBeanfactory beanfactory = new DefaultListableBeanfactory();
        //注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserInfoService.class);
        beanfactory.registryBeanDefinition("userService", beanDefinition);
        //获取bean
//        UserInfoService userService = (UserInfoService)beanfactory.getBean("userService");
//        userService.queeryUserInfo();
        UserInfoService userService = (UserInfoService)beanfactory.getBean("userService", "yzp");
        userService.queeryUserInfo();
    }
}
