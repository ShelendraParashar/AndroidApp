package com.weather;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testClass {
	char d;
	
	static FileReader reader;
	static Properties prop;
	static DesiredCapabilities caps = new DesiredCapabilities();
	
	public static void loadConfig() {

		try {
			reader = new FileReader("D:\\Twc-Android-Automation\\AndroidApp-master\\config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(reader);
			// prop.getProperty("capability.app");

		} catch (IOException e) {
			// TODO Aut o-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static void reaCap() {
		
		Set set= prop.entrySet();
		
		Iterator itr=set.iterator();  
		
		while(itr.hasNext()){  
			Map.Entry entry=(Map.Entry)itr.next();  
			
			String fullKey=(String) entry.getKey();
			
			String capabilityStart="capability";
			if(fullKey.contains(capabilityStart)) {
				
				String capabilityKey=fullKey.substring(capabilityStart.length()+1, fullKey.length());
				fullKey= fullKey.replaceAll("capability.", "");
				
				System.out.println(fullKey+"   "+entry.getValue());
			}
		}
		
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
	
		
	}

}
