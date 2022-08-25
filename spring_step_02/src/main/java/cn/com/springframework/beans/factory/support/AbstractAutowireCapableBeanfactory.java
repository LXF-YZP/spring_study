package cn.com.springframework.beans.factory.support;

import cn.com.springframework.beans.BeansException;
import cn.com.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author yuezp
 * @Date 2022/8/25 下午3:10
 * @Version v1.0
 */
public abstract class AbstractAutowireCapableBeanfactory extends AbstractBeanfactory{


    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {

        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("创建失败", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
