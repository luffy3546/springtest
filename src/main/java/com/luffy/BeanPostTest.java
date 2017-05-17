package com.luffy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostTest implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// System.out.println("BeanPostTest.postProcessBeforeInitialization: " +
		// beanName);
		Luffy annotation = bean.getClass().getAnnotation(Luffy.class);
		if (annotation != null) {
			System.out.println(annotation.value()[0]);
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// System.out.println("BeanPostTest.postProcessAfterInitialization: " +
		// beanName);
		return bean;
	}

}
