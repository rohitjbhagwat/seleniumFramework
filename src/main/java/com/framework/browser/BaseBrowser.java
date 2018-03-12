package com.framework.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.framework.pageElements.PageElements;

public abstract class BaseBrowser {

	private WebDriver driver;

	public void initializeBrowser() {
		setProperties();
		driver = getDriver();
		driver.manage().window().maximize();
	}

	public void closeBrowser(){
		driver.close();
	}

	public void openURL(String url){
		driver.get(url);
	}

	public PageElements getPage(PageElements pageElements){
		PageElements page = PageFactory.initElements(
							driver, pageElements.getClass());
		page.setDriver(driver);
		return page;
	}

	protected abstract void setProperties();

	protected abstract WebDriver getDriver();
}
