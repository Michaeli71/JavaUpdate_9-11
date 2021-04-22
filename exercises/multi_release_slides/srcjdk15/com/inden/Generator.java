package com.inden;

import java.util.List;
import java.util.Collection;

public class Generator 
{   
   public Collection<String> createStrings() 
   {
       System.out.println("""
       	                  THIS IS A
       	                  MULTI LINE 
       	                  STRING""");
    
       return List.of("New", "JDK 9", "Collection", "Factory", "Methods");
   }
}
