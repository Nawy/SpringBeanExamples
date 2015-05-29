package com.ermolaev.hellospring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/**/Bean.xml");
		
		
		Messager objHello = (Messager)context.getBean("helloWorld");
		
		objHello.setMessage("This is object A!");
		objHello.getMessage();
		
		MessagerEx objHelloEx = (MessagerEx)context.getBean("helloWorldEx");
		objHelloEx.getMessage();
		
		//we cannot create "goodbyeWorld" Bean, because It's abstract
		MessagerEx objByeEx = (MessagerEx)context.getBean("goodbyeWorldEx");
		objByeEx.getMessage();
		
		PersonInfo myInfo = (PersonInfo)context.getBean("personInfo");
		myInfo.setFirstName("Ivan");
		myInfo.setLastName("Ermolaev");
		myInfo.print();
		
		/*
		 Tod's info, will be printed 2 time with indexes: 6,7, because
		 default bean scope is singleton, and Increment class don't
		 stop count number 
		 */
		PersonInfo todInfo = (PersonInfo)context.getBean("personInfo");
		todInfo.setFirstName("Tod");
		todInfo.setLastName("Bernst");
		todInfo.setPrintNumber(7);
		todInfo.print();
		
		Countries countries = (Countries)context.getBean("countries");
		countries.getCountryList();
		countries.getCountrySet();
		countries.getCountryMap();
		countries.getCountryProps();
		
		context.registerShutdownHook();
	}
}
