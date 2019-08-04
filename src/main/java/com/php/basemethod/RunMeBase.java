package com.php.basemethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.php.pages.HomePage;

public class RunMeBase {
	
	WebDriver driver;
	HomePage hPage;

	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.geko.driver", "C:\\geckodriver-v0.23.0-win64");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
	}
	
	
	@Test
	public void home_page(){
		hPage = new HomePage(driver);
		hPage.addRemoveClick();
		System.out.println(driver.getTitle());
	}
}
