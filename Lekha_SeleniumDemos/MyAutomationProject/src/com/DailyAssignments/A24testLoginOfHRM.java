package com.DailyAssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class A24testLoginOfHRM {
	WebDriver driver;

	@Test
	public void user1() throws IOException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		// Screenshot
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("Dashboard.jpg"));
		System.out.println("Screenshot successful");

		/*
		 * Alert alt; JavascriptExecutor js= (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click()",
		 * driver.findElement(By.id("alertButton"))); alt= driver.switchTo().alert();
		 * alt.accept();
		 */
	}

	@Test
	public void user2() {
		driver.findElement(By.name("username")).sendKeys("lekha");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@BeforeMethod
	public void launchURL() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterMethod
	public void logoutUser() throws InterruptedException {
		Thread.sleep(5);
		if (driver.getCurrentUrl().contains("dashboard")) {
			Thread.sleep(2);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).click();
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logout Successfull");
		}
	}

	@BeforeTest

	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
