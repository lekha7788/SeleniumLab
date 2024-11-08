package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D08KeywordDriven {
	WebDriver driver;
	String fPath="E:\\Lekha_SeleniumDemos\\MyAutomationProject\\src\\com\\TestNGDemos\\MyLocatorsEchotrack .properties";
	File file;
	FileInputStream fis;
	Properties prop;
	
  @Test
  public void Login() {
	  driver.findElement(By.xpath(prop.getProperty("unTxBxXath"))).sendKeys("Lekha");
	  driver.findElement(By.id(prop.getProperty("psTxBxId"))).sendKeys("lekha123");
	  driver.findElement(By.name(prop.getProperty("lgBtnName"))).click();
  }
  @AfterMethod
  public void afterMethod() {
	 
	  System.out.println(driver.findElement(By.id(prop.getProperty("errMsgId"))).getText());
  }

  @BeforeTest
  public void beforeTest() throws IOException {
	  file=new File(fPath);
	  fis=new FileInputStream(file);
	  prop=new Properties();
	  prop.load(fis);
	  
	  
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(prop.getProperty("url"));
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
