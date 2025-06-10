package com.june3.jvmMCQ;



public class Test6 
{
    static int x = 10;

    {
        x = 50;
    }

    static 
    {
        x = 30;
    }

    public static void main(String[] args) 
    {
        System.out.println("Before Object Creation: " + x);
        Test6 obj1 = new Test6();
        System.out.println("After Object Creation: " + x);
    }
}
