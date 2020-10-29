package demoTest.demotest;

import junit.framework.Assert;

public class MainClass {

	static String var = "kailash";
	public static void main(String[] args) {
    	System.out.println("Bharat's requirements!!!");
    	// calling another method which is from junit library
    	
    	Assert.assertNotNull(var);
	}
}