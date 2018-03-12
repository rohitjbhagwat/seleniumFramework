package com.framework.pageElements;

import org.openqa.selenium.WebDriver;

public abstract class PageElements {

	protected WebDriver driver;

	public void setDriver(WebDriver driver){
		this.driver = driver;
	}

	protected abstract String validatePage();
}
