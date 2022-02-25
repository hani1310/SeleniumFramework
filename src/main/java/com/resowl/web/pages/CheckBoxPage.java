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
	List<WebElement> checkboxButtons;

	public void CheckBoxPage() {
		PageFactory.initElements(driver, this);

		/**
		 * Logic of Checked and unchecked
		 * 
		 */

		if (!((WebElement) driver.findElements(By.xpath("//input[@type='checkbox']"))).isSelected()) {
			driver.findElement(By.xpath("\"//input[@type='checkbox']")).click();
		}

	}

	/**
	 * GetCheckbox Button
	 * 
	 * @return
	 */
	public List<WebElement> getCheckboxButtons() {
		return checkboxButtons;
	}

	/**
	 * Getter for Checkbox link
	 * 
	 * @return
	 */
	public WebElement getcheckboxesLink() {
		return checkboxesLink;
	}

	/**
	 * Click on Checkbox Button
	 * 
	 * @return
	 */
	public CheckBoxPage clickcheckboxesButton() {
		clickElement(getcheckboxesLink());
		return new CheckBoxPage();
	}

	/**
	 * get delete buttons on the page
	 * 
	 * @return
	 */
	public int getCheckboxCount() {
		return getCheckboxButtons().size();

	}

	/**
	 * Click on Check button on the index
	 * 
	 * @param index
	 */
	public void clickCheckboxButton(int index) {
		clickElement(getCheckboxButtons().get(index));
	}

}
