package cn.com.springframework.beans.factory.support;

import cn.com.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author yuezp
 * @Date 2022/8/25 下午3:13
 * @Version v1.0
 */
public interface BeanDefinitionRegistry {

    //向注册表中注册beandefinition
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
