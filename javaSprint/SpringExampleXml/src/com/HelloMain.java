package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		HelloWorld h1 = (HelloWorld)ctx.getBean("h");
		HelloWorld h = ctx.getBean(HelloWorld.class);
//		HelloWorld h = new HelloWorld();
//		h.setName("Aryan");
		System.out.println(h.sayHello());
		
		System.out.println(h);
		System.out.println(h1);
		
		((AbstractApplicationContext)ctx).close();
	}

}
