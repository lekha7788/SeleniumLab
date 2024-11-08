package com.DailyAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A16ExplicitWait_Omayo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
        WebElement chkBox=driver.findElement(By.xpath("//input[@id='dte']"));
        System.out.println("Checkbox status is : " + chkBox.isEnabled());
        driver.findElement(By.cssSelector("button[onclick='setTimeout(myFunctionAXD,10000)']")).click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(chkBox));
        System.out.println("Checkbox status is : " + chkBox.isEnabled());
        chkBox.click();
       
	
	
	
	
		

	}

}
