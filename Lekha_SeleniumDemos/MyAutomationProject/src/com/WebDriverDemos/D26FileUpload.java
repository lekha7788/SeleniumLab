package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class D26FileUpload {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 450)", "");
		driver.findElement(By.id("firstName")).sendKeys("Lekha");
		driver.findElement(By.id("lastName")).sendKeys("123");
		driver.findElement(By.id("userEmail")).sendKeys("lekha@gmail.com");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/div[2]/label[1]")).click();
//		driver.findElement(By.cssSelector("input[value='Female']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("32546790766554");
		//DOB of user
		//driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "A");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("14 Jul 1993");
	/*	Select month=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")));
		month.selectByIndex(6);
		Select year = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")));
		year.selectByValue("1993");
		driver.findElement(By.cssSelector("div[aria-label='Choose Wednesday, July 14th, 1993']")).click();
		*/
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\Gayatri.000\\Downloads\\donating kavachakundal.jpeg");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[2]/div[1]/*[name()='svg'][1]")).click();
		js.executeScript("window.scrollBy(0, 450)", "");
		
		
		//driver.close();
		
		
		
	}

}
