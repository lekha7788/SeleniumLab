package com.DailyAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A19Login_Asana {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://asana.com/");
		//driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/a[2]/span[1]")).click();
	System.out.println("Title of page is : "+ driver.getTitle());

	}

}
