package com.WebDriverDemos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class D35Screenshot_Capturing {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://istqb.in/");
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file,new File("MyScreenshot.jpeg"));
		System.out.println("Screenshot captured");
        driver.navigate().to("")
	}

}
