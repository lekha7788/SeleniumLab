package com.DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A13DOBInReddif {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details ");
		// For Day DropDown list
		WebElement dayList=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(dayList);
		day.selectByValue("14");
		System.out.println("Selected Day is : " + day.getFirstSelectedOption().getText());
		 //To select Month from Month Dropdown
		//WebElement monthList= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month= new Select (driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")));
		month.selectByVisibleText("JUL");
		System.out.println("Selected Month is " +  month.getFirstSelectedOption().getText());
		// Year
		//WebElement yearList= driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]"));
		Select year= new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]")));
		year.selectByValue("1993");
		System.out.println("Selected year is " +  year.getFirstSelectedOption().getText());
		
		System.out.println("Selected DOB is : " + day.getFirstSelectedOption().getText() +  month.getFirstSelectedOption().getText()+ year.getFirstSelectedOption().getText() );
		
	}

}
