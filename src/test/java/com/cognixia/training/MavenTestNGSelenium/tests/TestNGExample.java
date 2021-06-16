package com.cognixia.training.MavenTestNGSelenium.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample 
{
    @Test
	public void testFirst()
	{
		System.out.println("This is a first Test in TestNG");
	}
    
    @BeforeTest
    public void setUp()
    {
    	System.out.println("This is to Setup");	
    }
    
    @AfterTest
    public void tearDown()
    {
    	System.out.println("Tear Down");
    }
    
}
