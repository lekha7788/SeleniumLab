package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D01FirstTest {
  @Test
  public void openDemoQaRegistration() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	  driver.get("https://demoqa.com/automation-practice-form");
	  System.out.println("Title is : "+ driver.getTitle());
	  driver.close();
	  
  }
}
