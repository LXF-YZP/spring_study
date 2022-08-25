package cn.com.springframework.beans.factory.config;

/**
 * @Author yuezp
 * @Date 2022/8/25 下午3:07
 * @Version v1.0
 * 单例注册
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);

}
