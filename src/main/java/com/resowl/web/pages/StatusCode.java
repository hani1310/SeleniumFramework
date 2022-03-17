package com.resowl.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resowl.web.base.BasePage;

public class StatusCode extends BasePage {
	
	@FindBy(linkText = "200")
	WebElement CodeClick;
	
	@FindBy(linkText = "here")
	WebElement hereButton;
	
	
	

	public WebElement getHereButton() {
		return hereButton;
	}
	
	public void clickHere() {
		clickElement(getHereButton());
	}

	public StatusCode() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCodeClick() {
		return CodeClick;
	}
	
	public  void clickStatus() {
		clickElement(getCodeClick());
	}
}
