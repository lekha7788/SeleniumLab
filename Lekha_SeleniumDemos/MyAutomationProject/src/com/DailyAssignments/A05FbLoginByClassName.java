package com.DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A05FbLoginByClassName {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement mobileNo=driver.findElement(By.className("inputtext._55r1.inputtext._1kbt.inputtext._1kbt"));
		mobileNo.sendKeys("8105920204");
		WebElement password=driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi"));
		password.sendKeys("abcd1234");
		WebElement loginBtn=driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy"));
		loginBtn.click();
		

	}

}
