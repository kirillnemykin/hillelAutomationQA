package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected static final String PROTOCOL = "https://";
    protected static final String DOMAIN = "ithillel.ua";
    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public abstract void goToPage();

    public String getTitle() {
        return driver.getTitle();
    }
}
