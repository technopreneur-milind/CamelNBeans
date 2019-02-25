package com.example.JavaFileCopier;

public class EnglishGreeter implements Greeter {
	 public String sayHello() {
	 return "Hello " + System.getProperty("user.name");
	 }
	}
