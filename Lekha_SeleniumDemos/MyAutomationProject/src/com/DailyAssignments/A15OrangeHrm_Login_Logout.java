package com.DailyAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A15OrangeHrm_Login_Logout {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2) );
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[placeholder='Username']"))	.sendKeys("Admin");	
		//driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//driver.findElement(By.name("password")).sendKeys("admin23");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		System.out.println( driver.getTitle() + "\n Login was successfull");
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).click();
		driver.findElement(By.cssSelector("p[class=\"oxd-userdropdown-name\"]")).click();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successfull");
		
	}

}
