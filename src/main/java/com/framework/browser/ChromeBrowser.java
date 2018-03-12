package com.framework.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser extends BaseBrowser {

	@Override
	protected void setProperties() {
		System.setProperty("webdriver.chrome.driver",	"D:/Documents/Selenium/chromedriver.exe");
	}

	@Override
	protected WebDriver getDriver() {
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
