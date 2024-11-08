package com.DailyAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04EchoLoginByClassName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		List<WebElement> userName=driver.findElements(By.className("form-control"));
		userName.get(0).sendKeys("Lekha");
		userName.get(1).sendKeys("12345");
		//driver.findElement(By.className("form-control")).sendKeys("12345");
		driver.findElement(By.className("btn-primary")).click();
		//WebElement loginBtn=driver.findElement(By.name("Butsub"));
		//loginBtn.click();

		
		Thread.sleep(6000);
		driver.quit();
	}

}
