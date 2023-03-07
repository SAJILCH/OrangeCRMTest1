package com.qa.orangecrmtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.jetbrains.com/
public class MainPage {
    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(css = "button[class$='orangehrm-login-button']")
    public WebElement buttonLogin;

    @FindBy(css = "p[class$='orangehrm-login-forgot-header']")
    public WebElement pForgotYourPassword;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
