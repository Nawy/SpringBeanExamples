package com.ermolaev.hellospring;

public class PersonInfo {
	private String firstName;
	private String lastName;
	private ComposePersonInfo pinfo;
	
	public PersonInfo(ComposePersonInfo pinfo)
	{
		this.pinfo = pinfo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void print()
	{
		pinfo.print(firstName, lastName);
	}
	
	public void setPrintNumber(int number)
	{
		pinfo.setPrintNumber(number);
	}
}
