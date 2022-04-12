package com.sunrise.sf.core.beanOverview.beanfactory;

/**
 * 通过静态工厂方法实例化bean
 */
public class DemoBeanFactory {
    private static final DemoBeanFactory factory = new DemoBeanFactory();
    private DemoBeanFactory() {}

    // 指定实例化当前bean的方法
    public static DemoBeanFactory createInstance() {
        return factory;
    }
}


