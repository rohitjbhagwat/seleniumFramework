package com.framework.page;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.pageElements.IndexPageElements;
import com.framework.pageElements.SignInPageElement;

public class IndexPageTest extends BasePageTest{

	@Test()
	public void testSignInBtnFunctionality() throws Exception {
		IndexPageElements indexPageElements = (IndexPageElements)browser.getPage(
														new IndexPageElements());
		indexPageElements.getSignInButton().click();
		Thread.sleep(2000);
		SignInPageElement signInPageElements = (SignInPageElement)browser.getPage(
																	new SignInPageElement());
		Assert.assertNull(signInPageElements.validatePage());
	}

	public void verifyIndexPage() {
		/*IndexPage mnPage = PageFactory.initElements(driver, IndexPage.class);
		//Sigin btn verification
		Assert.assertTrue(mnPage.SignInBtn.isDisplayed(), "Sign Btn was not displayed "+driver.getCurrentUrl());
		Assert.assertTrue(mnPage.skipId.isDisplayed(), "Skip Btn was not displayed "+driver.getCurrentUrl());
		Assert.assertTrue(mnPage.logoId.isDisplayed(), "Logo was not displayed "+driver.getCurrentUrl());
		Assert.assertTrue(mnPage.emailId.isDisplayed(), "emaail text box was not displayed "+driver.getCurrentUrl());
		//verify title of the page is Index
		Assert.assertTrue(driver.getTitle().trim().equals("Index"), "Page titel did not match "+driver.getCurrentUrl());*/




	}

}
