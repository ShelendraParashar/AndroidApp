package com.weather;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

class PropertiesClass {

	public static Properties loadConfig() {
		Properties prop = null;
		try {
			FileReader reader = new FileReader("D:\\Twc-Android-Automation\\AndroidApp-master\\config.properties");
			prop = new Properties();
			prop.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;

	}

	public static Capabilities returnCapabilityObject() {
		DesiredCapabilities caps = new DesiredCapabilities();
		Set set;
		Iterator itr;
		set = loadConfig().entrySet();
		itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			String fullKey = (String) entry.getKey();
			String capabilityStart = "capability";
			if (fullKey.contains(capabilityStart)) {
				fullKey = fullKey.replace("capability.", "");
				caps.setCapability(fullKey, entry.getValue());

			}
		}
		return caps;

	}

	public static URL returnAppiumUrl() {
		String appiumUrl = loadConfig().getProperty("appium.url");

		URL url = null;
		try {
			url = new URL(appiumUrl.toString());
		} catch (MalformedURLException e) {
			return url;
		}

		return url;

	}

}