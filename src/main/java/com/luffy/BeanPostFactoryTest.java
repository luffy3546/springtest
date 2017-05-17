package com.luffy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanPostFactoryTest implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
		System.out.println("BeanPostFactoryTest.postProcessBeanFactory");
		factory.addBeanPostProcessor(new BeanPostTest());
	}

}
