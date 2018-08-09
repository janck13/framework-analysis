package com.cmazxiaoma.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author cmazxiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2018/8/7 20:01
 */
public class SpringTestBean implements BeanNameAware, BeanFactoryAware {

    private BeanFactory beanFactory;

    private String beanName;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
//        System.out.println("beanFactory=" + this.beanFactory);
//
//        Object object = beanFactory.getBean("springTestBean");
//        System.out.println("springTestBean=" + object);
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
//        System.out.println("beanName=" + this.beanName);
    }

}