package cn.com.springframework.beans.factory.support;

import cn.com.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author yuezp
 * @Date 2022/8/26 上午10:30
 * @Version v1.0
 */
public interface BeanDefinitionRegistry {

    //向注册表中注册beanDefinition
    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
