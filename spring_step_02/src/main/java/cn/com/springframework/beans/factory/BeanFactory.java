package cn.com.springframework.beans.factory;

import cn.com.springframework.beans.BeansException;

/**
 * @Author yuezp
 * @Date 2022/8/25 下午3:05
 * @Version v1.0
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
