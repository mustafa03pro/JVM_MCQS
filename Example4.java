package com.june3.jvmMCQ;

class Example4
{
	static int x = 10;

	public static void main(String[] args)
	{
		System.out.println(Example4.m1()+ x);//110+110=220
	}

	static int m1()
	{
		x = x + 100;
		return x;
	} 
}