package com.TestNGDemos;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class A07AssertionDemo {
	WebDriver driver;
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;
			
	
	@Test(dataProvider = "getLoginData")
	public void loginToOHRM(String un, String ps) {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(ps);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).sendKeys(Keys.ENTER);
		
		actUrl = driver.getCurrentUrl();
		
	
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "swarna", "swarna123" },
			new Object[] { "nilima", "nilima123" },
			new Object[] { "admin", "admin123" },
			new Object[] { "lekha", "lekha123" },
		};
	}

	@AfterMethod
	public void logout() {
		if(driver.getCurrentUrl().contains("dashboard"))
		{
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Invalid credentials");
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");;
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
