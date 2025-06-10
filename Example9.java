package com.june3.jvmMCQ;


public class Example9 
{ 
	int x = 10; 
	public static void main(String[] args) 
	{ 
	  //System.out.println(x);//error
	} 
	static
	{ 
	  //System.out.print(x + " "); //error we cannot access the non static variable in static context
	} 
}