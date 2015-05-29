package com.ermolaev.hellospring;

public class ComposePersonInfo {
	private Increment incObject;
	private int printNumber;
	
	public void print(String firstName, String lastName)
	{
		// it's just counter, gtq = greater than or equel
		for(; incObject.gtq(printNumber); incObject.up(1))
			System.out.println(
					incObject.getCount()+ "): " + 
					firstName + " " + 
					lastName
			);
	}

	public Increment getIncObject() {
		return incObject;
	}

	public void setIncObject(Increment incObject) {
		this.incObject = incObject;
	}

	public int getPrintNumber() {
		return printNumber;
	}

	public void setPrintNumber(int printNumber) {
		this.printNumber = printNumber;
	}
	
	
}
