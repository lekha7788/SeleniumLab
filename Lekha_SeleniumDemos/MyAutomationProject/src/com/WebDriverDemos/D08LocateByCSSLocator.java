package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocateByCSSLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		//WebElement email=driver.findElement(By.cssSelector("input[class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbtnull\"]"));
		
		
		WebElement email= driver.findElement(By.cssSelector("input[id=\"email\"]"));
		email.sendKeys("lekha@hmail.com");
	WebElement paswd=driver.findElement(By.cssSelector("input[type=\"password\"][name=\"pass\"]"));
	paswd.sendKeys("233frfrffr");
	driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	}

}
