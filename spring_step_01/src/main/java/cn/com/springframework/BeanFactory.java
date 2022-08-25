package cn.com.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author yuezp
 * @Date 2022/8/25 下午12:42
 * @Version v1.0
 */
public class BeanFactory {


    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }


}
