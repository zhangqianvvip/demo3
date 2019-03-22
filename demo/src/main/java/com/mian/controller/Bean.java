package com.mian.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import framwork.bean.Helloworld;

public class Bean {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("classpath:/META-INF\"/applaction.xml");
		//按包的路径进行扫描
		context.scan("com.mian.controller");
		context.refresh();
		
		int count = context.getBeanDefinitionCount();
		System.out.println("Bean的个数"+count);
		String[] names=context.getBeanDefinitionNames();
		for(String name :names) {
			System.out.println();
		}
		Bean1 b = new Bean1();
		Helloworld d = b.helloworld();
		System.out.println();
	}

}
