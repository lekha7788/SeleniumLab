package com.DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A09EchoByAbsXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		//driver.findElement(By.xpath("//*[@id=\"txtCustomerID\"]")).sendKeys("Lekha");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div/div/div/form/fieldset/div[2]/fieldset/input[1]")).sendKeys("Lekha");
			//	html/body/div/div[2]/div/div[2]/div[4]/div[2]/form/fieldset/div/fieldset/input
		

	}

}
