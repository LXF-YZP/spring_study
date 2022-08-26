package cn.com.springframework.beans.factory.support;

import cn.com.springframework.beans.BeansException;
import cn.com.springframework.beans.factory.BeanFactory;
import cn.com.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author yuezp
 * @Date 2022/8/26 上午10:30
 * @Version v1.0
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeansException {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) throws BeansException {
        return doGetBean(beanName, args);
    }

    protected <T> T doGetBean(final String beanName, final Object[] args){
        Object singleton = getSingleton(beanName);
        if (singleton != null) {
            return (T)singleton;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return (T)createBean(beanName, beanDefinition, args);

    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;
}
