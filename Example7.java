package com.june3.jvmMCQ;



class Example7
{
	static int a = 50;

	public static void main(String[] args) 
	{
		int a = 60;
		a = a;
		System.out.println(a);//60
		System.out.println(Example7.a); //50
	}
}	