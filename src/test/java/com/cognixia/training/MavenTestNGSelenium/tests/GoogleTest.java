package com.cognixia.training.MavenTestNGSelenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest 
{
	private WebDriver driver ;
	private WebElement searchBox;
	
	 @Test
	 public void searchGoogle()
	 {
	    driver.navigate().to("https://google.com");	
	    searchBox = driver.findElement(By.name("q")); 
	    searchBox.sendKeys("Selenium");
	    String actual = driver.getTitle();
	    String expected = "selenium - Google Search";
	    if(actual.contains(expected))
	    {
	    	System.out.println("Test Passed");
	    }
	    else
	    {
	    	System.out.println("Test Failed : " + actual );
	    }
	}
	 
	 @BeforeTest
      public void setUp()
      {
       System.setProperty("webdriver.chrome.driver", "C:\\Tool\\Selenium\\chromedriver.exe");
       driver  =  new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }
	 
	 @AfterTest
	 public void tearDown()
	 {
		 driver.quit();
	 }
}