package com.practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToFacebook {
	
	@Test
	public void facebook()
	{

	WebDriverManager.chromedriver().setup();

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
    driver.get("https://www.facebook.com");
    
  String title = driver.getTitle();
  System.out.println(title);
    
	}	
}
