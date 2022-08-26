package cn.com.springframework.beans.factory.support;

import cn.com.springframework.beans.BeansException;
import cn.com.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author yuezp
 * @Date 2022/8/26 上午10:35
 * @Version v1.0
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] objects) throws BeansException;
}
