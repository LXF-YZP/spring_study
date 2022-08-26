package cn.com.springframework.beans.factory.config;

/**
 * @Author yuezp
 * @Date 2022/8/26 上午10:26
 * @Version v1.0
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
