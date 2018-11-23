package com.Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot01 
{
public static void getsc(WebDriver d,String mname) throws Throwable
{
	TakesScreenshot tc=(TakesScreenshot)d;
	File src = tc.getScreenshotAs(OutputType.FILE);
	File des = new File("./Photo/p1"+mname+".png");
	try
	{
	FileUtils.copyFile(src, des);
	}
	catch(IOException e)
	{
		
	}
}
}
