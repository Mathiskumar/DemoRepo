package com.test.mutliple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfc.com");
		
		Thread.sleep(5000);
		
		
		
		

	}

}
