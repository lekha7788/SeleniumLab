package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTests {
  @Test(priority =3)
  public void testMeesho() {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.meesho.com/");  
	  System.out.println("Title is : " +driver.getTitle());
	  
  }
  @Test(priority=1)
  public void bigBasket() {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.bigbasket.com/offers/");  
	  System.out.println("Title is : " +driver.getTitle());
	  
  }
  @Test(priority =2)
  public void testJioMart() {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.jiomart.com/");  
	  System.out.println("Title is : " +driver.getTitle());
	  
  }
  @Test (priority = 4)
	public void testBewakoof()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bewakoof.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
}
