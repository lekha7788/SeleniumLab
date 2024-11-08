package com.DailyAssignments;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A14BlingWebsite {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dash.bling-center.com/platform/signIn.html ");
		driver.findElement(By.id("email")).sendKeys("lekhaharish04@gmail.com");
		driver.findElement(By.id("password")).sendKeys("allari123");
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/div/div[5]/button/p")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("lekhaharish04@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/button[2]/p")).click();
		Thread.sleep(2000);
		String displayMsg=driver.findElement(By.id("resetsuccess")).getText();
		System.out.println(displayMsg);

	}

}
