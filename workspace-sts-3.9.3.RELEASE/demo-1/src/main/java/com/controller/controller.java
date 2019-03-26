package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.ConfigBean;

@RestController
//@EnableConfigrationProperties({ConfigBean.class})
@Component
@Profile({"prod"})
public class controller {
	@Autowired
	ConfigBean configBean;
	
	@RequestMapping(value = "/config")
	public String config() {
		return configBean.toString();
	}
	
	@Value("${hello:name}")
	private String hello;
	
	@Value("${name:age}")
	private String name;
	
	@RequestMapping(value = "/my")
	public String my() {
		return name;
	}
	@RequestMapping("hellow")
	public String hellow() {
		return "";
	}
	
	@RequestMapping("hellow1")
	public String getMessage() {
		
		return this.hello + "" + this.name;
	}
}
	
