package com.framework.page;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.framework.browser.BaseBrowser;

public class BasePageTest {

	protected BaseBrowser browser;

	private Properties p;

	public BasePageTest(){
		p = new Properties();
		try {
			p.load(new FileInputStream(new File("D:/Workspace/MySeleniumFramework/src/test/resources/test_configuration.properties")));
		} catch (FileNotFoundException e) {
			Assert.fail("Error in reading file", e);
		} catch (IOException e) {
			Assert.fail("Some IOException. ", e);
		}
		try {
			browser = (BaseBrowser)Class.forName(p.getProperty("browser")).newInstance();
		} catch (InstantiationException e) {
			Assert.fail("InstantiationException => ", e);
		} catch (IllegalAccessException e) {
			Assert.fail("IllegalAccessException => ", e);
		} catch (ClassNotFoundException e) {
			Assert.fail("ClassNotFoundException => ", e);
		}

	}

	@BeforeTest()
	public void init(){
		browser.initializeBrowser();
		browser.openURL(p.getProperty("indexUrl"));
	}

	@AfterTest()
	public void destroy(){
		browser.closeBrowser();
	}

}
