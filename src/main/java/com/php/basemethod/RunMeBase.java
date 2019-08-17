package com.php.basemethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class RunMeBase {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.geko.driver", "C:\\geckodriver-v0.23.0-win64");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		System.out.println("browser launched");
	}
	
	@Test
	public void method1(){
		System.out.println("This is executing method 1");
	}
	
}
