package com.resowl.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resowl.web.base.BasePage;

public class Input extends BasePage {
	
	@FindBy(linkText = "Inputs")
	private WebElement inputsElements;

	public Input() {
		PageFactory.initElements(driver, this);
	}
}
