package com.weather.screens;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.weather.BaseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LocationManagerScreen {

	AndroidDriver<AndroidElement> driver;

	public @FindBy(id = "com.weather.Weather:id/search_icon") WebElement searchIcon;

	public @FindBy(id = "com.weather.Weather:id/txt_location_name") WebElement searchTextBox;

	public @FindBy(id = "com.weather.Weather:id/search_text") WebElement searchTextBoxAfterClick;

	public @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.weather.Weather:id/search_item_container']") 
	WebElement locationSearchedResultLIst;

	public LocationManagerScreen(AndroidDriver<AndroidElement> driv) {
		this.driver = driv;
		PageFactory.initElements(driv, this);
	}

	public void clickOnSearchIcon() {
		searchIcon.click();
	}
	
	public Collection<WebElement> readLocations() {
		Collection <WebElement> locations= new ArrayList();
		locations.addAll(locations);
		return locations;
		
	}
	
	public void clickOnlocationFromLocationSearchResult() {
		List el= (List) readLocations();
		BaseTest.waitForElementToVisible(el);
		

	}

	public void searchAndAddLocation() {
		this.clickOnSearchIcon();
		searchTextBox.sendKeys("Atlanta,ga");
		BaseTest.waitForElementToVisible((List)readLocations());
		this.clickOnlocationFromLocationSearchResult();

	}

}
