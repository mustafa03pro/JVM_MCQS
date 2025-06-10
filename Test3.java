package com.june3.jvmMCQ;


class Test3 
{ 
	int x = 10; 
	public static void main(String[] args) 
	{ 
		
	  System.out.println(x); 
	} 
	
	static
	{ 
	  Test3 t = new Test3();	
	  System.out.print(t.x + " "); 
	} 
}