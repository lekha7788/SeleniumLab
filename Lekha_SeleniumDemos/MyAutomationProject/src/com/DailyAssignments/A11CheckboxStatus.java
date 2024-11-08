package com.DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A11CheckboxStatus {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms09.htm");
		WebElement milk=driver.findElement(By.name("option1"));
		WebElement butter=driver.findElement(By.name("option2"));
		WebElement cheese=driver.findElement(By.name("option3"));
		System.out.println("Before status of Checkbox");
		System.out.println("Milk Checkbox selection : " + milk.isSelected());
		System.out.println("Butter Checkbox selection : " + butter.isSelected());
		System.out.println("Cheese Checkbox selection : " + cheese.isSelected());
		System.out.println("Butter Checkbox visible : " + milk.isDisplayed());
		milk.click();
		butter.click();
		cheese.click();
		System.out.println("After status of Checkbox");
		System.out.println("Milk Checkbox selection : " + milk.isSelected());
		System.out.println("Butter Checkbox selection : " + butter.isSelected());
		System.out.println("Cheese Checkbox selection : " + cheese.isSelected());
		
		//isenabled
		System.out.println("Milk Checkbox selection : " + milk.isEnabled());
		System.out.println("Butter Checkbox selection : " + butter.isEnabled());
		System.out.println("Cheese Checkbox selection : " + cheese.isEnabled());
		System.out.println("Butter Checkbox visible : " + butter.isDisplayed());
		driver.quit();

	}

}
