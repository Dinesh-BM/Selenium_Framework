package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class basepage02  extends Basetest
{
	public WebDriver driver;
public basepage02(WebDriver driver)
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
public void elementvisiblility(WebElement e)
{
WebDriverWait wait1=new WebDriverWait(driver, 10);
try 
{
wait1.until(ExpectedConditions.visibilityOf(e));
Reporter.log("title is matching", true);
}
catch(Exception e1)
{
	Reporter.log("title is not matching",true);
	Assert.fail();
}
}
}

