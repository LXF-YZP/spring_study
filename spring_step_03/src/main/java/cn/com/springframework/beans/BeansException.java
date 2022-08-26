package cn.com.springframework.beans;

import cn.com.springframework.beans.factory.config.BeanDefinition;

/**
 * @Author yuezp
 * @Date 2022/8/26 上午10:23
 * @Version v1.0
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause){
        super(msg, cause);
    }
}
