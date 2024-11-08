package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class D07Parameterization {
	WebDriver driver;

	@Parameters ({"username", "password"})
	@Test
	public void login(String un, String ps) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}


  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.linkText("Logout")).click();
  }

  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://practice.expandtesting.com/login");
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0, 600)", "");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
