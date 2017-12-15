package com.weather;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
	
	static FileReader reader;
	static Properties prop;
	static DesiredCapabilities caps;
	static AndroidDriver<AndroidElement> driver;
	static WebDriverWait wait;
	
	public static AndroidDriver<AndroidElement> setUp() {
				
		if (PropertiesClass.returnAppiumUrl()==null) {
			System.out.println("Driver was not initialzed.");
			return null;
			
		}
		else {
		driver = new AndroidDriver<AndroidElement>(PropertiesClass.returnAppiumUrl() , PropertiesClass.returnCapabilityObject());
		
		return driver;
		}
		
		}
	

	public static void waitForElementToVisible(List <WebElement> ele) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));

	}

	public static void clickOnElement(WebElement ele) {
		ele.click();

	}

	public static void typeTextInElement(WebElement ele, String str) {
		ele.sendKeys(str);

	}

}
