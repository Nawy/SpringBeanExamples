package com.ermolaev.hellospring;

public class Increment {
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void up(int value)
	{
		count += value;
	}
	
	public boolean eq(int value)
	{
		return count == value;
	}
	
	public boolean gt(int value)
	{
		return count < value;
	}
	
	public boolean gtq(int value)
	{
		return count <= value;
	}
	
	public boolean lt(int value)
	{
		return count > value;
	}
	
	public boolean ltq(int value)
	{
		return count >= value;
	}
}
