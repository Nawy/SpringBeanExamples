package com.ermolaev.hellospring;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitMessagers implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean, String name)
	{
		System.out.println("Before init:" + name);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String name)
	{
		System.out.println("After init: " + name);
		return bean;
	}
}

