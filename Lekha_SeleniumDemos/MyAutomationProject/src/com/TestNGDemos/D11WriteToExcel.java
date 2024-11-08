package com.TestNGDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D11WriteToExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
  @Test
  public void writeData() {
	  row=sheet.createRow(0);
	  cell=row.createCell(0);
	  cell.setCellValue("Lekha");
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  file= new File("MyFirstExcel.xlsx");
	  fos= new FileOutputStream(file);
	  wb=new XSSFWorkbook();
	  sheet=wb.createSheet("MySheet");
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
  }

}
