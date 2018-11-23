package com.Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class select 
{
	public static void selectbyindex(WebElement e,int index)
	{
	Select s=new Select(e);
	s.selectByIndex(index);
	}
	public static void selectbyvalue(WebElement e,String value)
	{
	Select s=new Select(e);
	s.selectByValue(value);
	}
}
