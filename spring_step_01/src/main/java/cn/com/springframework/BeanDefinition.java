package cn.com.springframework;

/**
 * @Author yuezp
 * @Date 2022/8/25 下午12:41
 * @Version v1.0
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
