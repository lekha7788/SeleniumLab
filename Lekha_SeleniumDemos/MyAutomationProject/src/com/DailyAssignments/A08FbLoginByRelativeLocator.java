package com.DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

//Login with Valid email and Invalid password field in Facebook Login Page
public class A08FbLoginByRelativeLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("https://www.facebook.com/login/");
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.name("pass"))).sendKeys("8105920204");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.name("email"))).sendKeys("abcfdr");
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(By.name("pass"))).click();
		}

}
