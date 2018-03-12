package com.framework.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageElements extends PageElements{

	@FindBy(xpath = "//*[@ng-model='FirstName']")
	private WebElement firstNameTextBox;

	@FindBy(xpath = "//input[@ng-model='LastName']")
	private WebElement lastNameTextBox;

	@FindBy(xpath = "//*[@ng-model='Adress']")
	private WebElement addressTextBox;

	@FindBy(xpath = "//input[@ng-model='EmailAdress']")
	private WebElement emailaddressTextBox;

	@FindBy(xpath = "//input[@ng-model='Phone']")
	private WebElement phoneTextBox;

	@FindBy(xpath = ".//*[@value='Male']")
	private WebElement genderMale;

	@Override
	protected String validatePage() {
		// TODO Auto-generated method stub
		return null;
	}


}
