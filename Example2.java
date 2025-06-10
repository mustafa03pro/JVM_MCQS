package com.june3.jvmMCQ;



class Example2 
{
	static int a;
	
	public static void main(String[] args)
	{
		System.out.println(Example2.a); 
		Example2.a = Example2.initialize();
		System.out.println(Example2.a);
	}

	static int initialize() 
	{
		Example2.a = 50;
		return 60;
	}
	
}