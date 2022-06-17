package com.automation.workaccounts.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import work.automation.workaccounts.webobjects.LoginWebObjects;

public class Base {

	public static String configPath = "./resources/config.properties";
//	private static Logger logger = LogManager.getLogger(LoginWebObjects.class);
	public static WebDriver webdriver;
	
	
	static {
		if(getConfigValue("browser").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			webdriver = new ChromeDriver();
		} else if(getConfigValue("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			webdriver = new FirefoxDriver();
		} else if(getConfigValue("browser").equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			webdriver = new SafariDriver();
		}else if(getConfigValue("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			webdriver = new EdgeDriver();
		}
	}

	public WebElement getWebElement(By by) {
		return webdriver.findElement(by);

	}

	public static String getConfigValue(String key) {
		return getValue(configPath, key);
	}

	private static String getValue(String filePath, String key) {
		
		FileReader reader;
		Properties p = null;
		try {
			reader = new FileReader(filePath);
			p=new Properties();
			p.load(reader);
		} catch(IOException e) {
			e.printStackTrace();
		}
		return p.getProperty(key);
	}


}