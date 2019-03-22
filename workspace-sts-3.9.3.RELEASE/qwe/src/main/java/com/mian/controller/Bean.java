package com.mian.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean {

	public static void main(String[] args) {
		AppliactionContext context = new ClassPathXmlApplicationContext("classpath:/META-INF\"/applaction.xml");
		int count = context.getBeanDefinitionCount();
		System.out.println("Bean的个数"+count);
		String[] names=context.getBeanDefinitionNames();
		for(String name :names) {
			System.out.println();
		}
	}

}
