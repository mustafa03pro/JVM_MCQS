package com.june3.jvmMCQ;


class Example3 
{
	static int x = Example3.m1();

	public static void main(String[] args) 
	{
		System.out.println(Example3.x);
	}

	static int m1() 
	{
		x = 10;

		return Example3.m2();
	}

	static int m2() 
	{
		System.out.println(Example3.x); 
		return 20;
	}
}