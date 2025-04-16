package com.atria.encapdemo;

public class Encapsulation {
	
	int slno;
	String name;
	int age;
	
	public void show()
	{
		System.out.println("Serial No : "+slno+"\nName : "+name+"\nAge : "+age);
	}
	public static void main(String[] args) {
		Encapsulation ob=new Encapsulation();
		ob.slno=1;
		ob.name="Yash";
		ob.age=20;
		ob.show();

	}

}
