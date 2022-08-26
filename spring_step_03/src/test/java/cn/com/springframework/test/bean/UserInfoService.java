package cn.com.springframework.test.bean;

/**
 * @Author yuezp
 * @Date 2022/8/26 上午11:02
 * @Version v1.0
 */
public class UserInfoService {
    public String name;

    @Override
    public String toString() {
        return "UserInfoService{" +
                "name='" + name + '\'' +
                '}';
    }

    public UserInfoService(String name) {
        this.name = name;
    }

    public UserInfoService() {
    }

    public void queeryUserInfo(){
        System.out.println("查询用户信息" + name);
    }

}
