package com.cognixia.training.MavenTestNGSelenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxExample 
{
	public static void main(String args[])
	{

	System.setProperty("webdriver.gecko.driver", "C:\\Tool\\Selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver(); //Opens Blank browser
	driver.get("https://google.com");

}
}