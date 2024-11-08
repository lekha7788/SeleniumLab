package com.DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03EchoLoginByName {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		WebElement userName=driver.findElement(By.name("txtCustomerID"));
		userName.sendKeys("Lekha");
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys("Lekha");
		WebElement loginBtn=driver.findElement(By.name("Butsub"));
		loginBtn.submit();


	}

}
