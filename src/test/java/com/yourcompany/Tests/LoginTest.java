package com.yourcompany.Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.InvalidElementStateException;

import com.yourcompany.Pages.LoginPage;

public class LoginTest extends SampleSauceTestBase {

    public LoginTest(String os,
                                     String version, String browser, String deviceName, String deviceOrientation) {
        super(os, version, browser, deviceName, deviceOrientation);
    }
    
   
    @Test
    public void verifyLoginError() throws InvalidElementStateException {

        //Navigate to the page
    	driver.get("https://redcloud-api-tc.herokuapp.com/demo/home");

    	// get page object
    	LoginPage page = LoginPage.getPage(driver);

    	page.enterUserName("test");

    	page.clickLoginButton();
    	
        assertEquals(page.getErrorText(), "Error");

    }    
}
