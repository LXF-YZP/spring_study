package cn.com.springframework.beans.factory.support;

import cn.com.springframework.beans.factory.config.BeanDefinition;
import cn.com.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yuezp
 * @Date 2022/8/26 上午10:32
 * @Version v1.0
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObject = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObject.get(beanName);
    }

    protected void addSingleton(String beanName, Object objectSingle){
        singletonObject.put(beanName, objectSingle);
    }
}
