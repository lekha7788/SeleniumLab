package com.DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A12RadioButtonHandling {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/htmlforms10.htm");
		//Radio button : Milk
		WebElement milk= driver.findElement(By.cssSelector("input[value='Milk']"));
		System.out.println("Before status of Milk Radio button");
		System.out.println("Milk selected : "+ milk.isSelected());
		System.out.println("Milk Enabled : "+ milk.isEnabled());
		System.out.println("Milk visible : "+ milk.isDisplayed());
		
		//Radio button : Butter
				WebElement butter= driver.findElement(By.cssSelector("input[value='Butter']"));
				System.out.println("Before status of Butter Radio button");
				System.out.println("Butter selected : "+ butter.isSelected());
				System.out.println("Butter Enabled : "+ butter.isEnabled());
				System.out.println("Butter visible : "+ butter.isDisplayed());
				
				//Radio button : Cheese
				WebElement cheese= driver.findElement(By.cssSelector("input[value='Cheese']"));
				System.out.println("Before status of cheese Radio button");
				System.out.println("cheese selected : "+ cheese.isSelected());
				System.out.println("cheese Enabled : "+ cheese.isEnabled());
				System.out.println("Cheese visible : "+ cheese.isDisplayed());
				//Radio button : Water
				WebElement water= driver.findElement(By.cssSelector("input[value='Water']"));
				System.out.println("Before status of Water Radio button");
				System.out.println("water selected : "+ water.isSelected());
				System.out.println("water Enabled : "+water.isEnabled());
				System.out.println("water visible : "+ water.isDisplayed());
				//Radio button : Beer
				WebElement beer= driver.findElement(By.cssSelector("input[value='Beer']"));
				System.out.println("Before status of Beer Radio button");
				System.out.println("Beer selected : "+ beer.isSelected());
				System.out.println("Beer Enabled : "+ beer.isEnabled());
				System.out.println("BBeer visible : "+ beer.isDisplayed());
				//Radio button :Wine
				WebElement wine= driver.findElement(By.cssSelector("input[value='Wine']"));
				System.out.println("Before status of cheese Radio button");
				System.out.println("Wine selected : "+ wine.isSelected());
				System.out.println("Wine Enabled : "+ wine.isEnabled());
				System.out.println("Wine visible : "+ wine.isDisplayed());
				
				//Select the milk radio buttons
				milk.click();
				System.out.println("After status of Milk Radio button");
				System.out.println("Milk selected : "+ milk.isSelected());
				System.out.println("Milk Enabled : "+ milk.isEnabled());
				System.out.println("Milk visible : "+ milk.isDisplayed());
				
				butter.click();
				System.out.println("After status of Butter Radio button");
				System.out.println("Butter selected : "+ butter.isSelected());
				System.out.println("Butter Enabled : "+ butter.isEnabled());
				System.out.println("Butter visible : "+ butter.isDisplayed());
				cheese.click();
				System.out.println("After status of cheese Radio button");
				System.out.println("cheese selected : "+ cheese.isSelected());
				System.out.println("cheese Enabled : "+ cheese.isEnabled());
				System.out.println("Cheese visible : "+ cheese.isDisplayed());
				water.click();
				System.out.println("After status of Water Radio button");
				System.out.println("water selected : "+ water.isSelected());
				System.out.println("water Enabled : "+water.isEnabled());
				System.out.println("water visible : "+ water.isDisplayed());
				beer.click();
				
				System.out.println("After status of Beer Radio button");
				System.out.println("Beer selected : "+ beer.isSelected());
				System.out.println("Beer Enabled : "+ beer.isEnabled());
				System.out.println("BBeer visible : "+ beer.isDisplayed());
				
				wine.click();
				System.out.println("After status of cheese Radio button");
				System.out.println("Wine selected : "+ wine.isSelected());
				System.out.println("Wine Enabled : "+ wine.isEnabled());
				System.out.println("Wine visible : "+ wine.isDisplayed());
		

	}

}
