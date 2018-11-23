package com.Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.WebDriver;

public class input
{
	static String iname;
	
	public static String inputdata(String path,String sheet,int row,int cell) 
	{
		try{
		FileInputStream f=new FileInputStream(path);	
		Workbook book = WorkbookFactory.create(f);
		iname = book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(iname);
		}
		catch(Exception e)
		{
			
		}
		return iname;
	}


}
