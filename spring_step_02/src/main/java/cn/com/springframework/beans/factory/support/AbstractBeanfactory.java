package cn.com.springframework.beans.factory.support;


import cn.com.springframework.beans.BeansException;
import cn.com.springframework.beans.factory.BeanFactory;
import cn.com.springframework.beans.factory.config.BeanDefinition;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;

/**
 * @Author yuezp
 * @Date 2022/8/25 下午3:08
 * @Version v1.0
 */
public abstract class AbstractBeanfactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    @Override
    public Object getBean(String name) throws BeansException {
        Object singleton = getSingleton(name);
        if (singleton != null){
            return singleton;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);

        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
