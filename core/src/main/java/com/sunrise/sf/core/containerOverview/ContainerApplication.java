package com.sunrise.sf.core.containerOverview;

import com.sunrise.sf.core.containerOverview.entity.AccountDO;
import com.sunrise.sf.core.containerOverview.service.AccountServiceImpl;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author huangzihua
 * @date 2021-12-13
 */
public class ContainerApplication {
    public static void main(String[] args) {
        /*
        * ApplicationContext 是高级工厂接口，用于维护不同Bean的注册和相关依赖。
        */

        // 实例化容器
        ApplicationContext context = new ClassPathXmlApplicationContext("containerOverview/spring.xml");
        // getBean()方法用于获取注册到容器中的bean。
        AccountDO userDO = context.getBean(AccountDO.class);
        System.out.println(userDO.getName() + "/" + userDO.getAge());


        // 实例化容器(同时加载多个xml元数据配置文件)
        ApplicationContext context2 = new ClassPathXmlApplicationContext(
                "containerOverview/services.xml", "containerOverview/daos.xml");
        AccountServiceImpl accountService = context2.getBean(AccountServiceImpl.class);
        accountService.getName();

        // --------------------------------

        // 最灵活的变体是 GenericApplicationContext，可以和 reader delegates 结合使用。
        GenericApplicationContext gac = new GenericApplicationContext();
        new XmlBeanDefinitionReader(gac).loadBeanDefinitions("containerOverview/services.xml");
        gac.refresh();
    }
}
