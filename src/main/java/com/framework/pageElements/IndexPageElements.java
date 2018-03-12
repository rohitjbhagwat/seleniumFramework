package com.framework.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPageElements extends PageElements {

	@FindBy(id = "btn1")
	private WebElement signInButton;

	@FindBy(id = "btn2")
	private WebElement skipIdButton;

	@FindBy(id = "email")
	private WebElement emailIdTextField;

	@FindBy(id = "logo")
	private WebElement imageId;

	@FindBy(id = "enterimg")
	private WebElement loginId;

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getSkipIdButton() {
		return skipIdButton;
	}

	public WebElement getEmailIdTextField() {
		return emailIdTextField;
	}

	public WebElement getImageId() {
		return imageId;
	}

	public WebElement getLoginId() {
		return loginId;
	}

	public String validatePage(){
		String errorMessage = null;
		if(!signInButton.getAttribute("src").trim().endsWith("enter2.png"))
			errorMessage = "SignIn.html page was not displayed"+driver.getCurrentUrl();
		return errorMessage;
	}
}