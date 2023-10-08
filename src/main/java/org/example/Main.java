package org.example;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.config.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class  Main {
    public static void main(String[] args) throws InterruptedException, IOException {
//        WebDriver browser = new ChromeDriver();
//        WebDriverManager chromedriverManager = WebDriverManager.chromedriver();
//        chromedriverManager.setup();
//        WebDriver browser = chromedriverManager.create();
//        browser.manage().window().maximize();
//        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigProvider.timeout()));
//
//        browser.get("https://ithillel.ua/");
//        Thread.sleep(3000);
//
//        WebElement contacts = browser.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[5]/a"));
//        System.out.printf(contacts.getText());
//        contacts.click();

//        WebDriver browser = ConfigProvider.getDriver();
//
//        MainHillelPage mainPage = new MainHillelPage(browser);
//        mainPage.goToPage();
//
//        ContactsPage contactsPage = mainPage.clickContactsButton();
//        System.out.println(contactsPage.getTitle());
//
//        Thread.sleep(3000);
//
//        browser.quit();

        Selenide.open("https://blog.ithillel.ua/");
        BlogPage blogPage = new BlogPage();
        Thread.sleep(2000);
        blogPage.fillSearchField("any text");
        Thread.sleep(2000);
        Selenide.closeWebDriver();












    }
}