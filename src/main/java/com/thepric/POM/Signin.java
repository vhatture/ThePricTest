package com.thepric.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	public Signin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="tel")
	private WebElement mobilenumber;
	
	@FindBy (xpath = "//button[text()='Send OTP']")
	private WebElement sendOtp;
	
	@FindBy(xpath ="//button[text()='Verify OTP']")
	private WebElement verifyOtp;

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getSendOtp() {
		return sendOtp;
	}

	public WebElement getVerifyOtp() {
		return verifyOtp;
	}

	
}
