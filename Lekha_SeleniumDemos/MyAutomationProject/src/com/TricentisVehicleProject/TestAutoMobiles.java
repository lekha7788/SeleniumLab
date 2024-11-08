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

public class TestAutoMobiles {
	WebDriver driver;
  @Test(priority=1)
  public void auto_Silver() {
	//Select Price option
			String expPrice="224.00",expClaim="No",expDis="No",expCover="No",actPrice,actClaim,actDis,actCover;
			actPrice=driver.findElement(By.id("selectsilver_price")).getText();
			actClaim= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")).getText();
			actDis=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")).getText();
			actCover=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
			System.out.println("Checking Automobile - Silver values");
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
			//driver.findElement(By.cssSelector("input[value=\"Silver\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")).click();
			driver.findElement(By.id("nextsendquote")).click();
  }
  @Test (priority=2)
  public void auto_Gold(){
	//Select Price option
			String expPrice="662.00",expClaim="Submit",expDis="2",expCover="Limited",actPrice,actClaim,actDis,actCover;
			actPrice=driver.findElement(By.id("selectgold_price")).getText();
			System.out.println("Gold Price is "+ actPrice);
			actClaim= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")).getText();
			actDis=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]")).getText();
			actCover=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]")).getText();
			System.out.println("Checking Automobile - Gold values");
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
			//driver.findElement(By.cssSelector("input[value=\"Silver\"]")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tfoot[1]/tr[1]/th[2]/label[2]/span[1]")).click();
			driver.findElement(By.id("nextsendquote")).click();
  }
  @Test(priority=3)
  public void auto_Platinum() {
	//Select Price option
			String expPrice="1,299.00",expClaim="Submit",expDis="5",expCover="Limited",actPrice,actClaim,actDis,actCover;
			actPrice=driver.findElement(By.id("selectplatinum_price")).getText();
			System.out.println("Platinum Price is "+ actPrice);
			actClaim= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")).getText();
			actDis=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]")).getText();
			actCover=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[4]/td[4]")).getText();
			System.out.println("Checking Automobile - Platinum values");
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
			//driver.findElement(By.cssSelector("input[value=\"Silver\"]")).click();
			driver.findElement(By.xpath("//section[@id='pricePlans']//label[3]//span[1]")).click();
			driver.findElement(By.id("nextsendquote")).click();
  }
  @Test (priority=4)
  public void auto_Ultimate() {
	//Select Price option
			String expPrice="2,476.00",expClaim="Submit",expDis="10",expCover="UnLimited",actPrice,actClaim,actDis,actCover;
			actPrice=driver.findElement(By.id("selectultimate_price")).getText();
			System.out.println("Ultimate Price is "+ actPrice);
			actClaim= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]")).getText();
			actDis=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[3]/td[5]")).getText();
			actCover=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[4]/td[5]")).getText();
			System.out.println("Checking Automobile - Ultimatevalues");
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
			//driver.findElement(By.cssSelector("input[value=\"Silver\"]")).click();
			driver.findElement(By.xpath("//section[@id='pricePlans']//label[4]//span[1]")).click();
			driver.findElement(By.id("nextsendquote")).click();
  }
  
  @BeforeMethod
  public void autoMobile_Details() {
	  driver.get("https://sampleapp.tricentis.com/101/index.php");
		//AutoMobile Vehicle data
		driver.findElement(By.partialLinkText("Auto")).click();
	  WebElement make= driver.findElement(By.id("make"));
		Select vehicle= new Select(make) ;
		vehicle.selectByVisibleText("Audi");
		driver.findElement(By.id("engineperformance")).sendKeys("1000");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("12/1/2023");
		driver.findElement(By.id("numberofseats")).sendKeys("2");
		driver.findElement(By.id("fuel")).sendKeys("Petrol");
		driver.findElement(By.id("listprice")).sendKeys("1000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("12343");
		driver.findElement(By.id("annualmileage")).sendKeys("1000");
		driver.findElement(By.id("nextenterinsurantdata")).click();
		// Insurance Data Details
		driver.findElement(By.id("firstname")).sendKeys("Lekha");
		driver.findElement(By.id("lastname")).sendKeys("Aravinda");
		driver.findElement(By.id("birthdate")).sendKeys("7/14/1993");
		//driver.findElement(By.cssSelector("input[value=\"Female\"])")).click();
		WebElement drpList= driver.findElement(By.id("country"));
		Select country= new Select(drpList);
		country.selectByValue("India");
		driver.findElement(By.id("zipcode")).sendKeys("560078");
		driver.findElement(By.id("city")).sendKeys("Bangalore");
		WebElement occupation=driver.findElement(By.id("occupation"));
		Select work=new Select(occupation);
		work.selectByIndex(5);
		//driver.findElement(By.cssSelector("input[value=\"Speeding\"]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[1]/span[1]")).click();
		driver.findElement(By.id("nextenterproductdata")).click();
		//Product Data Details
		driver.findElement(By.id("startdate")).sendKeys("12/5/2024");
		WebElement insureSum= driver.findElement(By.id("insurancesum"));
		Select insum=new Select(insureSum);
		insum.selectByIndex(1);
		WebElement meritRating= driver.findElement(By.id("meritrating"));
		Select rating=new Select(meritRating);
		rating.selectByIndex(1);
		WebElement damageInsurance= driver.findElement(By.id("damageinsurance"));
		Select insurance=new Select(damageInsurance);
		insurance.selectByIndex(1);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[5]/p[1]/label[1]")).click();
		WebElement courtesyCar= driver.findElement(By.id("courtesycar"));
		Select courtCar=new Select(courtesyCar);
		courtCar.selectByIndex(1);
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