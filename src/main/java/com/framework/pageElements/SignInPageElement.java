package com.framework.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageElement extends PageElements {

	@FindBy(xpath = ".//*[@placeholder='E mail']")
	private WebElement emailTextBox;

	@FindBy(xpath="//input[@ng-model='Password']")
	private WebElement passwordTextBox;

	@FindBy(id="enterbtn")
	private WebElement enterButton;

	@FindBy(id="errormsg")
	private WebElement errorMessage;

	public String validatePage(){
		String errorMessage = null;
		if(!enterButton.getAttribute("src").trim().endsWith("enter2.png"))
			errorMessage = "SignIn.html page was not displayed"+driver.getCurrentUrl();
		//if(signIn, "Page title did not match "+driver.getCurrentUrl());
		//Assert.assertTrue(driver.getCurrentUrl().trim().endsWith("/SignIn.html"), "Page URL did not match "+driver.getCurrentUrl());
		return errorMessage;
	}
}
