package com.june3.jvmMCQ;


public class Test
{
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        Class cls = cl.loadClass("java.lang.String");
        System.out.println(cls.getClassLoader());//null
    }
}