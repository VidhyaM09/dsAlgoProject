package com.dsAlgo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsAlgo.selenium.base.SeleniumBase;

public class Treepage extends SeleniumBase {

	@FindBy(xpath = "//a[@href='/tree']")
	WebElement eleGetstartedList;
	
	public Treepage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickGetStarted() {
		click(eleGetstartedList);
	}
}

