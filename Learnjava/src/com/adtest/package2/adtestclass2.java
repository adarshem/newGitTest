package com.adtest.package2;

import org.testng.annotations.Test;

import com.adtest.package1.*;

public class adtestclass2 extends adtestclass1 {
	
	
	void method() {
		 System.out.println(i);
		 
		 /*
		 * Here property j is accessed via Inheritance hence it will be
		 * accessible. But same variable can not be accessed if you try to
		 * access via instance because modifier used here is protected so it
		 * will be available to sub class only via inheritance.
		 */
		 
		 System.out.println(j);
		 
		 /*
		 * As k is private so it will not be accisible to subclass neither way.
		 * Neither it can be accessed via Inheritance nor direct.
		 */
		
		
		 
		 /*
		 * Here you are trying to access protected variable directly. So it will
		 * not be accessible and compile will give an error.
		 */
		 
		 
		 // Private variable will not be accessible here also.
 // Compilation error
		 }
	
	
	
	

	
	
@Test

	public void login()
	{
		System.out.println(adtestclass1.UserName);
		System.out.println(adtestclass1.UserName);
		System.out.println(adtestclass1.UserName);
		
	}


}
