package com.pentachrome.cartcatalyst.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility 
{
	/**
	 * This is used to maximize the browser window
	 * @param driver
	 * @author Rahul
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * This statement is used to provide implicitwait to the WebElement
	 * @param driver
	 * @param sec
	 */
	public void implicitWait(WebDriver driver, int sec) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	/**
	 * this statement is used to provide pageLoadTimeout
	 * @param driver
	 * @param sec
	 */
	public void pageLoadTimeout(WebDriver driver, int sec)
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
	}
	/**
	 * This method will return the WebDriver wait object.
	 * 
	 * @param driver
	 * @param sec
	 * @return WebDriver wait object
	 */
	public WebDriverWait webDriverWaitObject(WebDriver driver, int sec)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		return wait;
	}
	/**
	 * This method is used to provide explicit wait with the condition Visibility of element.
	 * @param driver
	 * @param sec
	 * @param ele
	 */
	public void waitUntilEleToBeVisible(WebDriver driver, int sec, WebElement ele)
	{
		webDriverWaitObject(driver, sec).until(ExpectedConditions.visibilityOf(ele));	
	}
	/**
	 * This method is used to provide explicit wait with the condition element to be clickable
	 * @param driver
	 * @param sec
	 * @param ele
	 */
	public void waitUntilEleToBeClickable(WebDriver driver, int sec, WebElement ele)
	{
		webDriverWaitObject(driver, sec).until(ExpectedConditions.elementToBeClickable(ele));
	}
	

}
