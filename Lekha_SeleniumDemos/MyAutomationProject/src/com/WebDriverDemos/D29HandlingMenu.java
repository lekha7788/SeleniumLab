package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D29HandlingMenu {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://istqb.in/");
		
		List<WebElement>menus = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li"));
	    for(WebElement m:menus) {
	    	System.out.println(m.getText());
	    }
	    Actions act= new Actions(driver);
	    WebElement spMenu= driver.findElement(By.linkText("SPECIALIST"));
	    act.moveToElement(spMenu).perform();
	    int totalSubMenu=driver.findElements(By.cssSelector("//*[@id=\"sp-menu\"]/div/nav/ul/li[6]/div/div/ul/li")).size();
	   System.out.println(totalSubMenu);
	   for(int i=1; i<=totalSubMenu; i++) {
	        String getTextSubMenu = driver.findElement(By.cssSelector("//*[@id=\"sp-menu\"]/div/nav/ul/li[6]/div/div/ul/li)[" +i +"]")).getText();
	        System.out.println("Get Sub Menu Title : "+ getTextSubMenu);
	   }
	   
	    
	}

}
