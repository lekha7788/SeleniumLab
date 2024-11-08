package com.DailyAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01GetPageSource {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		driver.close();
		

	}

}
