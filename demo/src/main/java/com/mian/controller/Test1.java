package com.mian.controller;

import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class Test1 {
	private FileSystemXmlApplicationContext context;
	public Test1() {
		//容器的初始化
		context = new FileSystemXmlApplicationContext("classpath:/META-INF/applaction.xml");
		context.registerShutdownHook();//容器关闭确认
	}
	@Test
	public void testApplicationTest() {
		System.out.println("sdfa");
	}
	@Test
	public void testBean() {
		Bean Bean = context.getBean("Bean",Bean.class);
	}
}
