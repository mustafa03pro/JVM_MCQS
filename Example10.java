package com.june3.jvmMCQ;


public class Example10
{
    int value = 50;

    public static void main(String[] args) 
    {
        Example10 obj = getInstance();
        System.out.println(obj.value);  
    }

    public static Example10 getInstance() 
    {
        return new Example10();
    }
}