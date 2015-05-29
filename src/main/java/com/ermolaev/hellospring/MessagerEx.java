package com.ermolaev.hellospring;

public class MessagerEx {
	private String message = "None";
	private String threadName = "Undefined";
	
	public void getMessage() {
		System.out.println("[" + threadName + "]: " + message);
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void getThreadName() {
		System.out.println("Thread name: " + threadName);
	}
	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}
	
	public void init()
	{
		System.out.println("Init EX Bean!");
	}
	
	public void destroy()
	{
		System.out.println("Destroy EX Bean!");
	}
}
