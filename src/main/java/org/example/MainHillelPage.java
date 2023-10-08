package org.example;

import org.example.config.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainHillelPage extends AbstractPage {

//    private static final By CONTACTS_BUTTON_CSS_SELECTOR
//            = By.cssSelector("li.site-nav-menu_item a.site-nav-link[href*=\"contact\"]");
//    private static final By BLOG_BUTTON_CSS_SELECTOR
//            = By.cssSelector("li.site-nav-menu_item a.site-nav-link[href*=\"blog\"]");
    @FindBy(css = "li.site-nav-menu_item a.site-nav-link[href*=\\\"contact\\\"]")
    private WebElement contactsButton;
    @FindBy(css = "li.site-nav-menu_item a.site-nav-link[href*=\\\"blog\\\"]")
    private WebElement blogButton;

    public MainHillelPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void goToPage() {
        driver.get(ConfigProvider.getBaseUrl());
    }

    public ContactsPage clickContactsButton() {
        //contactsButton = driver.findElement(CONTACTS_BUTTON_CSS_SELECTOR);
        contactsButton.click();
        return new ContactsPage(driver);
    }

    public void clickBlogButton() {
        //blogButton = driver.findElement(BLOG_BUTTON_CSS_SELECTOR);
        blogButton.click();
    }
}
