package com.DailyAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A21RegForm {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jotform.com/form-templates/exam-registration-form");
		driver.findElement(By.xpath("//*[@id=\"first_9\"]")).sendKeys("Abhi");
		//driver.findElement(By.name("q9_studentName[first]")).sendKeys("Abhinav");
		driver.findElement(By.name("q9_studentName[last]")).sendKeys("Abhi");
		driver.findElement(By.name("q10_studentRegistration")).sendKeys("12234");
		driver.findElement(By.name("q3_registeredCourse")).sendKeys("CSE");
		driver.findElement(By.name("lite_mode_11")).sendKeys("07-12-2020");
		

	}

}
