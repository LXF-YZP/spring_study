package cn.com.springframework.beans.factory;

import cn.com.springframework.beans.BeansException;

/**
 * @Author yuezp
 * @Date 2022/8/26 上午10:25
 * @Version v1.0
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;
    Object getBean(String beanName, Object... args) throws BeansException;
}
