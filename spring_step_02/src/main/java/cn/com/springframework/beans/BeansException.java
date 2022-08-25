package cn.com.springframework.beans;

/**
 * @Author yuezp
 * @Date 2022/8/25 下午3:04
 * @Version v1.0
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg){

        super(msg);
    }
    public BeansException(String msg, Throwable throwable){
        super(msg, throwable);
    }

}
