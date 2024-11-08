package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class D15RelativeLocator {

	public static void main(String[] args) {
		
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/login/");
     //Relative locator for emailId field
     driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.name("pass"))).sendKeys("lekha@gmail.com");
   //Relative locator for password field which is below email field
     driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.name("email"))).sendKeys("lekha1123$");
   //Relative locator for Login Button
     driver.findElement(RelativeLocator.with(By.tagName("button")).below(By.name("pass"))).click();
     }

}
