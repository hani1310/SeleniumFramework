package com.resowl.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resowl.web.base.BasePage;

public class WelcomePage extends BasePage{
	
	
	
	
	@FindBy(linkText = "Add/Remove Elements")
	private WebElement addRemoveElementLink;
	
	@FindBy(linkText = "Checkboxes")
	private WebElement checkboxesLink;
	
	public WelcomePage() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Getter for add remove link
	 * @return
	 */
	public WebElement getAddRemoveElementLink() {
		return addRemoveElementLink;
	}
	
	
	/**
	 * Gettter for checkbox link
	 * @return
	 */
	public WebElement getCheckboxesLink() {
		return checkboxesLink;
	}

	/**
	 * CLick on add remove element link
	 * @return
	 */
	public AddRemovePage clickAddRemoveElement() {
		clickElement(getAddRemoveElementLink());
		return new AddRemovePage();
	}
	/**
	 * Click on Checkbox link 
	 * @return
	 */
	public CheckBoxPage clickCheckboxLink() {
		clickElement(getCheckboxesLink());
		return new CheckBoxPage();
	}

}
