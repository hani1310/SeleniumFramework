package com.resowl.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resowl.web.base.BasePage;

public class InputPage extends BasePage {
	
	@FindBy(linkText = "Inputs")
	private WebElement inputsElements;

	@FindBy(xpath = "//input['number']")
	private WebElement inputNumber;
	
	public InputPage() {
		PageFactory.initElements(driver, this);
		
		
	}

	
	public InputPage clickInputPage() {
		clickElement(getclickInput());
		return new InputPage();
	}
	private WebElement getclickInput() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
