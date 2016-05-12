
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestShiro {
    
    private static Logger log = LoggerFactory.getLogger(TestShiro.class);  
    
    @Test
    public void testHelloworld() {    
        //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
        Factory<org.apache.shiro.mgt.SecurityManager> factory =
                new IniSecurityManagerFactory("classpath:shiro.ini");
        //2、得到SecurityManager实例 并绑定给SecurityUtils
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken("admin", "admin");
        UsernamePasswordToken token = new UsernamePasswordToken("admin123", "admin11");
        
        try {
            //4、登录，即身份验证
            subject.login(token);
            log.info(token.getPrincipal().toString() + "用户登录验证成功！");
        } catch (AuthenticationException e) {
            //5、身份验证失败
        	 log.info("用户登录验证失败！"+e.getMessage());
        }

        Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录

        //6、退出
        subject.logout();
        log.info("用户已成功注销！");
    }

}