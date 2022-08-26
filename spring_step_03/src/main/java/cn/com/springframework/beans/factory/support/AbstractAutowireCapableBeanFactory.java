package cn.com.springframework.beans.factory.support;

import cn.com.springframework.beans.BeansException;
import cn.com.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author yuezp
 * @Date 2022/8/26 上午10:29
 * @Version v1.0
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{


    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }

    private InstantiationStrategy instantiationStrategy = new CglibSubclassinginstantiationStrategy();
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;
        bean = createBeanInstance(beanDefinition, beanName, args);
        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] objects) {
        Constructor constructor = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] constructors = beanClass.getDeclaredConstructors();
        for (Constructor<?> constr : constructors) {
            //循环比对出构造函数集合与入参信息 args 的匹配情况，这里我们对比的方式比较简单，只是一个数量对比，
            // 而实际 Spring 源码中还需要比对入参类型，否则相同数量不同入参类型的情况，就会抛异常了
            if (objects != null && constr.getGenericParameterTypes().length == objects.length) {
                constructor = constr;
                break;
            }
        }

        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructor, objects);
    }



}
