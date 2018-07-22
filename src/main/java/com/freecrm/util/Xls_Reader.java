package com.freecrm.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	
	public FileInputStream f=null;
	XSSFWorkbook w=null;
	XSSFSheet s=null;
	XSSFRow  r=null;
	XSSFCell c=null;
	
	public String getCellData(String sheetName,int colNum,int rowNum) throws IOException{
		f=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/freecrm/config/Freecrm.xlsx");
		w=new  XSSFWorkbook(f);
		s=w.getSheet(sheetName);
		r=s.getRow(rowNum);
		c=r.getCell(colNum);
		return c.getStringCellValue();
		
	}

	public static void main(String[] args) throws IOException {
		Xls_Reader  s=new  Xls_Reader();
		System.out.println(s.getCellData("Sheet1", 0, 0));
	}
}
