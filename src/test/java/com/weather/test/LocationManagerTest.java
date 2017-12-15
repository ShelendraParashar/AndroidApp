package com.weather.test;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.weather.BaseTest;
import com.weather.screens.LocationManagerScreen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LocationManagerTest {
	
	AndroidDriver<AndroidElement> driver;
	LocationManagerScreen  LocationManagerPageObj;

	
	
	@Test(priority=0)
	public void testSearchIocnIsVisible() {  
		driver = BaseTest.setUp();
		LocationManagerPageObj = new LocationManagerScreen(driver);
		
	   LocationManagerPageObj.searchAndAddLocation();
	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   //WebDriverWait wait= new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.LinearLayout[@resource-id='com.weather.Weather:id/search_item_container']")));
	
	  // driver.findElements(By.xpath("//android.widget.LinearLayout[@resource-id='com.weather.Weather:id/search_item_container']")).get(0).click();
	System.out.println(driver.findElements(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.weather.Weather:id/search_list']/child::android.widget.LinearLayout")).size());
	   
	}
	}

	
	/*@Test(priority=1)
	public void testSearchLocationTextBoxTextHint() {
		Assert.assertEquals("Search locations", LocationManagerPageObj.searchTextBox.getText());
	}
	
	@Test(priority=2)
	public void testSearchAndSaveLocation() {
		BaseTest.clickOnElement(LocationManagerPageObj.searchIcon);
		BaseTest.typeTextInElement(LocationManagerPageObj.searchTextBoxAfterClick, "Miami");
	}*/
