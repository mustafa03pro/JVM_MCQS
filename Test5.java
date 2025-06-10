package com.june3.jvmMCQ;


public class Test5 
{
    static 
    {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    Test5() 
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args) 
    {
        System.out.println("Main Method");
        Test5 obj1 = new Test5();
        Test5 obj2 = new Test5();
    }
}