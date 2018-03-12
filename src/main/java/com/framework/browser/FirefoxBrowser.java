package com.framework.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser extends BaseBrowser {

	@Override
	protected void setProperties() {
		System.setProperty("webdriver.geccko.driver",System.getProperty("user.dir") + "//drivers//geccko.exe");
	}

	@Override
	protected WebDriver getDriver() {
		return new FirefoxDriver();
	}

}
