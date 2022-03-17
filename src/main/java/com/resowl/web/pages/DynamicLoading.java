package com.resowl.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resowl.web.base.BasePage;

public class DynamicLoading extends BasePage {

	@FindBy(linkText = "Example 1: Element on page that is hidden")
	WebElement LoginClick;

	@FindBy(xpath = "//*[@id=\'start\']/button")
	WebElement StartButton;

	@FindBy(linkText = "Example 2: Element rendered after the fact")
	WebElement LoginClick2;

	public DynamicLoading() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoginClick() {
		return LoginClick;
	}

	public WebElement getLoginClick2() {
		return LoginClick2;
	}

	public WebElement getStartButton() {
		return StartButton;
	}

	public void clickDynamic() {
		clickElement(getLoginClick());
	}

	public void clickDynamicLink2() {
		clickElement(getLoginClick2());

	}

	public void clickStartLink() {
		clickElement(getStartButton());
	}

}
