package com.resowl.web.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resowl.web.base.BasePage;

public class CheckBoxPage extends BasePage {

	@FindBy(linkText = "Checkboxes")
	private WebElement checkboxesLink;

	@FindBy(linkText = "checkboxes1")
	private WebElement checkboxesLink1;

	public CheckBoxPage() {
		PageFactory.initElements(driver, this);

	}
}
