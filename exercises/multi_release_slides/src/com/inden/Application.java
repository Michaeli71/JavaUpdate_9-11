package com.inden;

public class Application 
{
    public static void main(final String[] args)
    {
    	final Generator gen = new Generator();
        System.out.println("Generated strings: " + gen.createStrings());
    }
}
