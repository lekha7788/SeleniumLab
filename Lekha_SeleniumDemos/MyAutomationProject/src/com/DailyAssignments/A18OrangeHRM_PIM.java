package com.DailyAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A18OrangeHRM_PIM {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("firstName")).sendKeys("Lekha");
		driver.findElement(By.name("middleName")).sendKeys("Aravinda");
		driver.findElement(By.name("lastName")).sendKeys("Thunugunta");
		driver.findElement(By.cssSelector(".oxd-input.oxd-input--focus")).sendKeys("03017");
		driver.findElement(By.cssSelector(".oxd-switch-input.oxd-switch-input--active.--label-right")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Lekha");
		//driver.findElement(By.cssSelector(".oxd-input.oxd-input--focus")).sendKeys("Lekha123");
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--focus']")).sendKeys("lekha123");
		driver.findElements(By.xpath("//input[@class='oxd-input oxd-input--focus']]")).sendKeys("lekha123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}
