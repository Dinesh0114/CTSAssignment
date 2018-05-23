package com.cts.program;

public class StringEqual {
	public void string(String str1,String str2)
	{
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Strings are equal");
		}
		
		else
			System.out.println("Strings are unequal");
	}
}