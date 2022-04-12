package com.sunrise.sf.core.beanOverview.beanfactory;

import com.sunrise.sf.core.beanOverview.service.BeanOneServiceImpl;
import com.sunrise.sf.core.beanOverview.service.BeanTwoServiceImpl;

/**
 * 通过实例工厂的方法创建bean
 */
public class DefaultServiceLocator {
    private static BeanOneServiceImpl beanOneService = new BeanOneServiceImpl();
    private static BeanTwoServiceImpl beanTwoService = new BeanTwoServiceImpl();

    public BeanOneServiceImpl createBeanOneServiceInstance() {
        return beanOneService;
    }

    public BeanTwoServiceImpl createBeanTwoServiceInstance() {
        return beanTwoService;
    }
}
