package com.DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A06RediffByCss {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//https://register.rediff.com/register/register.php?FormName=user_details
		WebElement fullName=driver.findElement(By.cssSelector("input[type=\"text\"]"));
		fullName.sendKeys("Lekha");
		//driver.findElement(By.cssSelector("input[name=\"login057068f7\]")).sendKeys("lekha");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("lekha123");
		driver.findElement(By.cssSelector("input#newpasswd1")).sendKeys("lekha123");
		//driver.findElement(By.cssSelector("input[name*='confirm_passwd057068f7'")).sendKeys("lekha123");
		//driver.findElement(By.cssSelector("name=^\"altemail057068f7\"")).sendKeys("allari123@gmail.com");
		driver.findElement(By.cssSelector("#mobno")).sendKeys("7863290367");
		
		/*	driver.findElement(By.cssSelector("input[name^='name']")).sendKeys("Puneeth");
		driver.findElement(By.cssSelector("input[name^='login']")).sendKeys("LearnSelenium");
		driver.findElement(By.cssSelector("input#newpasswd")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("input[name*='confirm_passwd']")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("input[name^='altemail']")).sendKeys("Learn@gmail.com");
		driver.findElement(By.cssSelector("input[id='mobno']")).sendKeys("6893224415");

		*/
	}

}
