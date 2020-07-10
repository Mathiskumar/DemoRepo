package com.test.mutliple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNG {
	
	WebDriver driver;
	
	@BeforeMethod
	public void TestSetup() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		driver.get("https://www.google.com");
		
	}

	
	@Test
	public void GetTitle() {
		
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Google");
	}
	
	@Test
	public void ImageTest() {
		
		boolean B1 = driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println(B1);
		Assert.assertEquals(B1, true);
		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	

}
