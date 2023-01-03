package com.qatest.qatest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "//*[@id='name-lite']")
    public WebElement strongNameLite;

    @FindBy(xpath = "//*[@id='name-classic']")
    public WebElement strongNameClassic;

    @FindBy(xpath = "//*[@id='name-premium']")
    public WebElement strongNamePremium;

    @FindBy(xpath = "//*[@id='ae-contry-flag']")
    public WebElement divContryFlag;

    @FindBy(xpath = "//*[@id='currency-lite']")
    public WebElement divCurrencyLite;

    @FindBy(xpath = "//*[@id='currency-classic']")
    public WebElement divCurrencyClassic;

    @FindBy(xpath = "//*[@id='currency-premium']")
    public WebElement divCurrencyPremium;

    @FindBy(xpath = "//*[@id='selected-country-name']")
    public WebElement spanSelectedCountryName;



    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
