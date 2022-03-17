package com.resowl.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resowl.web.base.BasePage;

public class FormAuth  extends BasePage{
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement passwrd;
	
	@FindBy(xpath  = "//*[@class=\"radius\"]")
	WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/a")
	WebElement logoutButton;
	
	
	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getPasswrd() {
		passwrd.sendKeys("SuperSecretPassword!");
		return passwrd;
	}

	public WebElement getUsername() {
		username.sendKeys("tomsmith");
		
		return username;
	}

	public FormAuth() {
		PageFactory.initElements(driver, this);
	}

	public void clickUser() {
		clickElement(getUsername());
	}
	public void clickLogin() {
		clickElement(getLoginButton());
	}
	
	public void clickPwd() {
		clickElement(getPasswrd());
	}

	public void clickOut() {
		clickElement(getLogoutButton());
	}
}
