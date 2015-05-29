package com.ermolaev.hellospring;


public class Messager 
{
	private String message = "None";

	public void getMessage() {
		System.out.println(message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init()
	{
		System.out.println("Init Bean!");
	}
	
	public void destroy()
	{
		System.out.println("Destroy Bean!");
	}
}

