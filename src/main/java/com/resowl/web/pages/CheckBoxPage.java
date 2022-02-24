package com.resowl.web.pages;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resowl.web.base.BasePage;

public class CheckBoxPage extends BasePage {
	CheckBoxPage checkboxPo;

	@FindBy(linkText = "Checkboxes")
	private WebElement checkboxesLink;

	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> checked;

	public void CheckBoxPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckboxesLink() {

		return checkboxesLink;
	}

	public List<WebElement> getChecked() {
		return checked;
	}

	public void clickCheckboxLink() {
		

	}

	public boolean isSelected() {
		return true;
	}

}
