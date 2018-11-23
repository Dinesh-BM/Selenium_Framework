package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generic.basepage01;

public class Actiloginpage01 extends basepage01
		{
		
			@FindBy(id="username")
			private WebElement username;
			@FindBy(name="pwd")
			public WebElement password;
			@FindBy(id="loginButton")
			public WebElement login;
			public Actiloginpage01(WebDriver driver)
			{
				super(driver);
			PageFactory.initElements(driver, this);
			}
			public void setusername(String username)
			{
				this.username.sendKeys(username);
			}
	}

