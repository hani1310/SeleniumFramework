package com.resowl.web.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resowl.web.base.BasePage;

public class CheckBoxPage extends BasePage {
	CheckBoxPage checkboxPo;

	@FindBy(linkText = "Checkboxes")
	private WebElement checkboxesLink;

	@FindBy(linkText = "checkboxes1")
	private WebElement checkboxesLink1;

	public void CheckBoxPage() {
		PageFactory.initElements(driver, this);
	}

	public CheckBoxPage clickCheckboxLink1() {
		clickElement(getCheckboxesLink());
		return new CheckBoxPage();
	}

	@FindBy(linkText = "checkboxes ")
	private WebElement checkboxes1Link;

	private WebElement getCheckboxesLink() {
		// TODO Auto-generated method stub
		return null;
	}

	public void clickCheckboxLink() {
		// TODO Auto-generated method stub

	}

}
