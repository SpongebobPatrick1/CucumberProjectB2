package com.loop.pages;

import com.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    @FindBy(name="q")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@value='Google Search']")
    public WebElement searchButton;

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}