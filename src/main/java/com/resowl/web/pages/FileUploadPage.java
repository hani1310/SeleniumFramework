package com.resowl.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resowl.web.base.BasePage;

public class FileUploadPage extends BasePage {

	@FindBy(id = "file-upload")
	WebElement fileUpload;

	@FindBy(id = "file-submit")
	WebElement chooseFile;

	public FileUploadPage() {
		PageFactory.initElements(fileUpload, this);

		driver.findElement(By.xpath("//*[@id='file-upload']")).sendKeys("E:\\jays photos 21-10\\paris.jpg");
		driver.findElement(By.xpath("//*[@id='file-submit']")).click();
	}

	public WebElement getUploadFileButton() {
		return fileUpload;
	}

	public void clickUploadFileButton() {
		clickElement(getUploadFileButton());
	}

	public WebElement getChooseButton() {
		return chooseFile;
	}

	public void ClickChooseButton() {
		clickElement(getChooseButton());
	}
}
