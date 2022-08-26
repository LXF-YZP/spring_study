package cn.com.springframework.beans.factory.support;

import cn.com.springframework.beans.BeansException;
import cn.com.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author yuezp
 * @Date 2022/8/26 上午10:35
 * @Version v1.0
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] objects) throws BeansException {

        Class beanClass = beanDefinition.getBeanClass();
        if (null != constructor) {
            try {
                beanClass.getConstructor(constructor.getParameterTypes()).newInstance(objects);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new BeansException("Failed to Instantiate" + beanName, e);
            }
        }
        return null;
    }
}
