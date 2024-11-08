package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05FlipkartAssignment {
	WebDriver driver;
    JavascriptExecutor js;
	@Test(priority=1)
	public void mobiles() {
		WebElement mobile=driver.findElement(By.partialLinkText("Mobiles"));
		
		js.executeScript("arguments[0].click()", mobile);
		
	}

	//@Test(priority=2)
	public void Tvs() {
		WebElement tv=driver.findElement(By.partialLinkText("Tvs"));
		js.executeScript("arguments[0].click()", tv);
	}

	@Test(priority=3)
	public void Electronics() {
		WebElement electronics=driver.findElement(By.partialLinkText("Elec"));
		js.executeScript("arguments[0].click()", electronics);
	}

	@Test(priority=4)
	public void Fashion() {
		WebElement fashion=driver.findElement(By.partialLinkText("Fashion"));
		js.executeScript("arguments[0].click()", fashion);
	}

	@Test(priority=5)
	public void Beauty() {
		WebElement beauty=driver.findElement(By.partialLinkText("Beauty"));
		js.executeScript("arguments[0].click()", beauty);
	}

	@BeforeMethod
	public void OpenFlipkart() {
		driver.get("https://www.flipkart.com/");
		System.out.println("Title of Website is : " + driver.getTitle());
	}

	@AfterMethod
	public void Items() {
		System.out.println("Title of selected Item is : " + driver.getTitle());
	}

	@BeforeTest
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}