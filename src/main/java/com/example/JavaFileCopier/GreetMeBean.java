package com.example.JavaFileCopier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetMeBean {
	private Greeter greeter;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GreetMeBean bean = (GreetMeBean) context.getBean("greetMeBean");
		bean.execute();
	}

	public void setGreeter(Greeter greeter) {
		this.greeter = greeter;
	}

	public void execute() {
		System.out.println(greeter.sayHello());
	}
}
