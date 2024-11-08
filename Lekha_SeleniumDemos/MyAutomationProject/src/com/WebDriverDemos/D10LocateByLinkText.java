package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// element /control About in Google.co.in
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.linkText("About")).click();
		WebElement help=driver.findElement(By.linkText("Help"));
		System.out.println(help);
		driver.quit();
	}

}