package com.adtest.package1;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import com.adtest.package2.adtestclass2;


public class adtestclass1
{
	
	public static String UserName;
	
	public int i =1;
	protected int j =2;
	private int k= 3;
	


	public static void main() throws FileNotFoundException
	{
	    try {

	        InputStream is =  this.getClass().getResourceAsStream("/Element.properties");
	        Properties elementProperties = new Properties();
			elementProperties.load(is);
			
			UserName = elementProperties.getProperty("UserName");
			
			System.out.print(UserName);
			
	    	}
	    catch (Exception e)
	    	{
	        System.out.println("Exception ==>" + e);
	    	}
	    
	    adtestclass2.main();
	}
	
	
}
