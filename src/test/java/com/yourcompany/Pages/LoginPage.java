package com.yourcompany.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase {

	@FindBy(name = "username")
	private WebElement userName;

	@FindBy(tagName = "input")
	private List<WebElement> inputs;

	@FindBy(className = "usa-alert-heading")
	private WebElement error;

	public void enterUserName(String u){
		LoginPage.setTextInputValue(userName,u);
	}

	public void clickLoginButton() {
		LoginPage.clickButton(inputs.get(2));
	}

	public String getErrorText() {
		return error.getText();
	}

	
	public static LoginPage getPage(WebDriver driver) {
		return PageFactory.initElements(driver, LoginPage.class);
	}
}
