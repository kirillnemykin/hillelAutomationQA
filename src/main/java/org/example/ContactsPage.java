package org.example;

import org.openqa.selenium.WebDriver;

public class ContactsPage extends AbstractPage {

    private static final String CONTACTS = "/contact";
    private static final String CONTACTS_URL = PROTOCOL + DOMAIN + CONTACTS;
    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void goToPage() {
        driver.get(CONTACTS_URL);

    }
}
