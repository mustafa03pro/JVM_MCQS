package com.june3.jvmMCQ;


public class Example15 
{
    {
        System.out.println("Instance Block");
    }

    static 
    {
        System.out.println("Static Block");
    }

    public static void show() 
    {
        System.out.println("Static Method");
        //display();
    }

    public void display() 
    {
        System.out.println("Instance Method");
    }

    public static void main(String[] args) 
    {
        show();
    }
}