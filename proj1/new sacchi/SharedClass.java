package com.syne.basic.sharingdatawithpicocontainer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	
	
	private static  WebDriver driver;
	
	
	@Before
	public WebDriver getDriver() throws InterruptedException {
		System.out.println("in setup");
		if(driver ==null){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\cucu\\chromedriver_win32_39\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		System.out.println("opened browser");
		Thread.sleep(2000);		
		return driver;
	}
	
	@After
	public void tearDown(){
		driver.quit();
		driver = null;
	}

}
