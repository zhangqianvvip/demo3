package com.mian.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import framwork.bean.Helloworld;

@Configuration
public class Bean1 {
	@Bean
	public Helloworld helloworld() {
		Helloworld bean1 = new Helloworld();
		bean1.setName("rwefg");
		return  bean1;
		
	}
}
