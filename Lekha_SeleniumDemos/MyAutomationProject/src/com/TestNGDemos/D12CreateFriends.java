package com.TestNGDemos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D12CreateFriends {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow row;
	XSSFCell cell;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() throws InvalidFormatException, IOException {
	  file= new File("ExcelFiles\\friendsData.xlsx");
	  fos=
	  wb=new XSSFWorkbook();
	  sh= 
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
