package com.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class Basetest implements Autoconst
{
public WebDriver d;
static 
{
System.setProperty(chrkey, chrval);
System.setProperty(geckey, gecrval);
}
@Parameters({"browser"})
@BeforeMethod(alwaysRun=true)
public void beforemethod(String browser)
{
	if(browser.equals("chrome"))
	{
		d=new ChromeDriver();
	}
	else
	{
		d=new FirefoxDriver();
	}
		
d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
d.manage().window().maximize();
d.get("https://demo.actitime.com/login.do;jsessionid=A1B7F22728504F4E903CFEA10992FE82");
}
@AfterMethod(alwaysRun=true)
public void aftermethod(ITestResult re) throws Throwable
{
	int a=re.getStatus();
	String mname=re.getMethod().getMethodName();
	mname.hashCode();
	if(a==2)
	{
		Screenshot01.getsc(d, mname);
	}
d.close();
}
}
