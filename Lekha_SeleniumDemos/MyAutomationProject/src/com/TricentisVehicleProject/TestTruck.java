package com.TricentisVehicleProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestTruck {
	WebDriver driver;
	
  @Test(priority=1)
  public void truck_Silver() throws InterruptedException {
	//Price option
	  Thread.sleep(5000);
			String expPrice="287.00",expClaim="No",expDis="No",expCover="No",actPrice,actClaim,actDis,actCover;
			actPrice=driver.findElement(By.id("selectsilver_price")).getText();
			actClaim= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")).getText();
			actDis=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")).getText();
			actCover=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
			System.out.println("Checking Truck - Silver values");
			if(actPrice.equals(expPrice))
				System.out.println("Price Matching .....");
			else
				System.out.println("Price not matching....");
			
			if(actClaim.equals(expClaim))
				System.out.println("Online Claim Matching .....");
			else
				System.out.println("Online Claim not matching....");
			if(actDis.equals(expDis))
				System.out.println("Claims Discount Matching .....");
			else
				System.out.println("Claim Discount not matching....");
			if(actCover.equals(expCover))
				System.out.println("Worldwide Cover Matching .....");
			else
				System.out.println("Worldwide Cover not matching....");
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")).click();
			driver.findElement(By.id("nextsendquote")).click();
  }
  @Test (priority=2)
  public void truck_Gold() {
	//Price option
			String expPrice="846.00",expClaim="Submit",expDis="2",expCover="Limited",actPrice,actClaim,actDis,actCover;
			actPrice=driver.findElement(By.id("selectgold_price")).getText();
			actClaim= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")).getText();
			actDis=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]")).getText();
			actCover=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]")).getText();
			System.out.println("Checking Truck -Gold values");
			if(actPrice.equals(expPrice))
				System.out.println("Price Matching .....");
			else
				System.out.println("Price not matching....");
			
			if(actClaim.equals(expClaim))
				System.out.println("Online Claim Matching .....");
			else
				System.out.println("Online Claim not matching....");
			if(actDis.equals(expDis))
				System.out.println("Claims Discount Matching .....");
			else
				System.out.println("Claim Discount not matching....");
			if(actCover.equals(expCover))
				System.out.println("Worldwide Cover Matching .....");
			else
				System.out.println("Worldwide Cover not matching....");
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tfoot[1]/tr[1]/th[2]/label[2]/span[1]")).click();
			driver.findElement(By.id("nextsendquote")).click();
  }
  @BeforeMethod
  public void truckDetails() {
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		//AutoMobile Vehicle data
		driver.findElement(By.linkText("Truck")).click();
		//Vehicle Data
		WebElement make= driver.findElement(By.id("make"));
		Select vehicle= new Select(make) ;
		vehicle.selectByVisibleText("Honda");
		driver.findElement(By.id("engineperformance")).sendKeys("1000");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("10/18/2024");
		driver.findElement(By.id("numberofseats")).sendKeys("2");
		driver.findElement(By.id("fuel")).sendKeys("Gas");
		driver.findElement(By.id("payload")).sendKeys("1000");
		driver.findElement(By.id("totalweight")).sendKeys("1000");
		driver.findElement(By.id("listprice")).sendKeys("1000");
		driver.findElement(By.id("annualmileage")).sendKeys("1000");
		driver.findElement(By.id("nextenterinsurantdata")).click();
		//Insurance data
		driver.findElement(By.id("firstname")).sendKeys("Lekha");
		driver.findElement(By.id("lastname")).sendKeys("Aravinda");
		driver.findElement(By.id("birthdate")).sendKeys("7/14/1993");
		//driver.findElement(By.cssSelector("input[value=\"Female\"])")).click();
		new Select(driver.findElement(By.id("country"))).selectByValue("India");
		driver.findElement(By.id("zipcode")).sendKeys("560078");
		driver.findElement(By.id("city")).sendKeys("Bangalore");
		new Select(driver.findElement(By.id("occupation"))).selectByIndex(5);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[1]/span[1]")).click();
		driver.findElement(By.id("nextenterproductdata")).click();
		//Product Data
		driver.findElement(By.id("startdate")).sendKeys("12/5/2024");
		new Select(driver.findElement(By.id("insurancesum"))).selectByIndex(1);
		new Select(driver.findElement(By.id("damageinsurance"))).selectByIndex(1);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[4]/p[1]/label[1]/span[1]")).click();
		driver.findElement(By.id("nextselectpriceoption")).click();
  }

  @AfterMethod
  public void sendNote() throws InterruptedException {
	  
		driver.findElement(By.id("email")).sendKeys("lekha@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9856432456");
		driver.findElement(By.id("username")).sendKeys("lekha");
		driver.findElement(By.id("password")).sendKeys("Lekhas123$");
		driver.findElement(By.id("confirmpassword")).sendKeys("Lekhas123$");
		driver.findElement(By.id("sendemail")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).getText());
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[5]/section[1]/div[8]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]")).click();
	
	  
}

  @BeforeTest
  public void LaunchBrowser() {
	   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
 }
  @AfterTest
  public void closeBrowser()  {
	  driver.close();
	  
  }
}
