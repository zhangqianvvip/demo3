package com.mian.controller;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	private ClassPathXmlApplicationContext context;
	public Test1() {
		context = new ClassPathXmlApplicationContext("classpath:applaction.xml");
		context.registerShutdownHook();
		System.out.println("ApplicationContext hashCode:"+context.hashCode());


	}
	@Test
	public void testApplicationTest() {
		
	}
	@Test
	public void testLifeBean() {
		LifeBean lifeBean = context.getBean("lifeBean", LifeBean.class);
	}

}
