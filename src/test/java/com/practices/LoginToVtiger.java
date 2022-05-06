package com.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToVtiger {

	@Test
		public void logintovtiger()
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.name("user_name"));
		un.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.name("user_password"));
	    pwd.sendKeys("admin");
		
		WebElement btn = driver.findElement(By.id("submitButton"));
		btn.submit();
		System.out.println(driver.getTitle());
		
	}
}
