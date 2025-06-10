package com.june3.jvmMCQ;


public class Test4 
{
	int x = 10; 
	public static void main(String[] args) 
	{ 	 
		Test4 obj = passObject(null);
		System.out.println(obj.x);
	}
	
	static
	{ 
	  Test4 t = new Test4();	
	  System.out.print(t.x + " "); 
	  passObject(t);
	} 
	
	public static Test4 passObject(Test4 t1)
	{
		return t1;
		
	}	
}