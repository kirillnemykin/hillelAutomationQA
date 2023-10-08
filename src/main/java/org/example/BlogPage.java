package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class BlogPage {

    private SelenideElement searchButton = Selenide.$(By.id("siteNavSearch"));
    private SelenideElement searchField = Selenide.$x("//*[@id=\"siteNavSearch\"]/div/input");

    public void fillSearchField(String search) {
        searchButton.shouldHave(Condition.visible);
        System.out.println(searchField.isEnabled());
        searchButton.click();
        searchField.shouldHave(Condition.visible).setValue(search).pressEnter();
    }

}
