package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generic.basepage02;

public class Homepage extends basepage02
{
	@FindBy(xpath=("//div[text()='USERS']"))
	private WebElement User;
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public Homepage(WebDriver driver)
	{
		super(driver);
	PageFactory.initElements(driver, this);
	}
	public void setUser()
	{
		this.elementvisiblility(this.User);
		this.User.click();
	}
	public void clicklogout()
	{
		this.elementvisiblility(this.logout);
		this.logout.click();
	}

}
