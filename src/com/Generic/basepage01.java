package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class basepage01 
{
	public WebDriver driver;
public basepage01(WebDriver driver)
{
this.driver=driver;
}
public void titlewait(String title)
{
WebDriverWait wait=new WebDriverWait(driver, 10);
try 
{
wait.until(ExpectedConditions.titleIs(title));
Reporter.log("title is matching", true);
}
catch(Exception e)
{
	Reporter.log("title is not matching",true);
	Assert.fail();
}
}
}
