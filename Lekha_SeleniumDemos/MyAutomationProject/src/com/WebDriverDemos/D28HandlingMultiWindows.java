package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class D28HandlingMultiWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//a[@class='newclose']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]/span[2]")).click();
System.out.println("Title: " + driver.getTitle());
		
		java.util.Set<String> windows = driver.getWindowHandles(); 
		System.out.println(windows);
		
		Iterator<String>itr = windows.iterator();	
		//Interface which is used to iterate over Set (To read the elements from Set)
		String win1 = itr.next();	//Will read 1st element
		String win2 = itr.next();	//Will read 2nd element
		
		driver.switchTo().window(win2);
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.findElement(By.linkText("Continue")).click();
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		
		driver.findElement(By.linkText("ABOUT US")).click();
		Thread.sleep(5000);
		
		driver.quit();


	}

}
