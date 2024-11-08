package com.DailyAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A17Redus_ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://www.redbus.in/?gad_source=1&gclid=Cj0KCQjwmt24BhDPARIsAJFYKk0G1Z8e1eAXGFuyL6v4gH4F63xD6541nIAtfMk30E2pgXipjJRo_sEaArVcEALw_wcB");
		driver.findElement(By.id("src")).sendKeys("Hyd");
		WebElement src=driver.findElement(By.xpath("//text[@class='placeHolderMainText'][normalize-space()='Hyderabad']"));
		wait.until(ExpectedConditions.visibilityOf(src));
		src.click();
		
		
	}

}
