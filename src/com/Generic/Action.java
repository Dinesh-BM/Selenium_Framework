package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action 
{
public static void doubleclick(WebDriver d,WebElement e)
{
Actions a=new Actions(d);
a.doubleClick(e);
}
public static void contextclick(WebDriver d,WebElement e)
{
Actions a=new Actions(d);
a.contextClick(e);
}
}
