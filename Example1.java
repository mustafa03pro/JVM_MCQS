package com.june3.jvmMCQ;


class Example1 
{
		static 
		{
			int x = 10;
			Example1.x = x+x;
			System.out.println(Example1.x);
		}

		static int x;
		
		public static void main(String[] args) 
		{
			System.out.println("Class Level X : "+Example1.x);
		}

		static 
		{
			x = x + Example1.x;
			System.out.println(x);

		}
}