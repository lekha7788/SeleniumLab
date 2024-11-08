package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D03Before_AfterTest {
	WebDriver driver;
  @Test(priority=2)
  public void IstQb() {
	  driver.get("https://istqb.in/specialist");
	  System.out.println("Title: " + driver.getTitle());
	  System.out.println("Test1");
  }
  @Test(priority=1)
  public void RedBus() {
	  driver.get("https://www.redbus.in/?gad_source=1&gclid=Cj0KCQjwmt24BhDPARIsAJFYKk0G1Z8e1eAXGFuyL6v4gH4F63xD6541nIAtfMk30E2pgXipjJRo_sEaArVcEALw_wcB");
	  System.out.println("Title: " + driver.getTitle());
	  System.out.println("Test2");
  }
  @Test(priority=3)
  public void Google() {
	  driver.get("https://www.google.co.in/");
	  System.out.println("Title: " + driver.getTitle());
	  System.out.println("Test3");
  }
  @BeforeTest
  public void LaunchBrowser() {
	   driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterTest
  public void CloseBrowser() {
	  driver.close();
	  System.out.println("After Test"); 
  }

}
