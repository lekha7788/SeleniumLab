package com.DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A10RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/?gad_source=1&gclid=Cj0KCQjwmt24BhDPARIsAJFYKk0G1Z8e1eAXGFuyL6v4gH4F63xD6541nIAtfMk30E2pgXipjJRo_sEaArVcEALw_wcB");
		driver.findElement(By.id("src")).sendKeys("bang");
		Thread.sleep(5000);
		
	//WebElement src=driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li[1]"));
	//src.click();
	
	WebElement src=driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul"));
	src.click();
	//Select source=new Select(from);
	//src.selectByVisibleText("Bangalore")
	//Select destination/ To
	 driver.findElement(By.id("dest")).sendKeys("Hyde");
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[3]/div[1]/ul/li[2]/div/text[1]")).click();
	//Calender
	driver.findElement(By.xpath("//span[normalize-space()='30']")).click();
	//search button
	driver.findElement(By.id("search_button")).click();
	//driver.manage().timeouts()implicitlyWait(0, 5000);
	Thread.sleep(6000);
	String result=driver.findElement(By.xpath("//*[@id=\"16050074\"]/div/div[1]/div[1]/div[1]/div[1]")).getText();
	System.out.println(result);
	
	}
	
}
