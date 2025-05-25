package com.atria.day8;

public class FinalVa {
	final static int a=10;
	final static int b;
	void change() {
		a=10;
		b=20;
	}
	
	@Override
	public String toString() {
		return "value of a=" + a+ "]";
	}

	static {
		a=10;
		b=20;
	}

}
