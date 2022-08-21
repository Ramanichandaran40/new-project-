package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.Commonactions;

public class MobileValidationPage extends Commonactions{
	public MobileValidationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text() ='✕']")
	private WebElement loginHandle;
	
	@FindBy(name ="q")
	private WebElement searchBox;

	public WebElement getLoginHandle() {
		return loginHandle;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}
	
	

}
