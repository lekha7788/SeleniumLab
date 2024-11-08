package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03GetTitle {

	public static void main(String[] args) {
		String expTitle="Google",actTitle;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.co.in/");
		actTitle= driver.getTitle();
		System.out.println("Title of page is ::"+actTitle);
		if(actTitle.equals(expTitle))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		driver.close();
	}

}
