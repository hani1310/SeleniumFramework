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

	/**
	 * Getter for checkbox link
	 * 
	 * @return
	 */
	
	public WebElement getCheckboxesLink() {
		return checkboxesLink ;
	}

	/**
	 * click checked box
	 * 
	 * @return
	 */
	public List<WebElement> getChecked() {
		
		if ( !driver.findElement(By.xpath("//input[@type=' checkbox 1\r\n"+ "']")).isSelected() )
		{
		     driver.findElement(By.xpath("//input[@type=' checkbox 2\r\n"+ "']")).click();
		}
		return checked;
		
	}
  
}
