package com.DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02EchoLoginById {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		WebElement userName=driver.findElement(By.id("txtCustomerID"));
		userName.sendKeys("Lekha");
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("Lekha");
		WebElement loginBtn=driver.findElement(By.id("Butsub"));
		loginBtn.submit();

	}

}
