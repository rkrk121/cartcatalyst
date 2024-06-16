package com.pentachrome.cartcatalyst.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class BaseClass 
{
	public static WebDriver driver;
	
	public void connectToDB()
	{
		Reporter.log("DB connected", true);
	}
	
	public void launchBrowser()

}
