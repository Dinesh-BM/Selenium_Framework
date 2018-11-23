package com.scripts;

import org.testng.annotations.Test;

import com.Generic.Basetest;
import com.Generic.input;
import com.pom.Actiloginpage01;
import com.pom.Homepage;

public class homeuser extends Basetest
{
		@Test(groups= {"login"})
		public void loginscript() throws Throwable
		{
			  Actiloginpage01 ob=new Actiloginpage01(d); 
			   // ob.setusername(input.inputdata());
			  	ob.setusername(input.inputdata(Expath,"Sheet1",0,1));
				ob.password.sendKeys("manager");
				Thread.sleep(5000);
				ob.login.click();
				Thread.sleep(5000);
				System.out.println(d.getTitle());
				ob.titlewait("actiTIME - Enter Time-Track");
				Homepage h=new Homepage(d);
				h.setUser();

		}


}
