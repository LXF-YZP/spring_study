package cn.com.springframework.beans.factory.support;

import cn.com.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yuezp
 * @Date 2022/8/25 下午3:15
 * @Version v1.0
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {


    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject){

        singletonObjects.put(beanName, singletonObject);
    }
}
