package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver browser = new ChromeDriver();
        WebDriverManager chromedriverManager = WebDriverManager.chromedriver();
        chromedriverManager.setup();
        WebDriver browser = chromedriverManager.create();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));

        browser.get("https://ithillel.ua/");
        Thread.sleep(3000);

        WebElement contacts = browser.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[5]/a"));
        System.out.printf(contacts.getText());
        contacts.click();
        Thread.sleep(3000);

        browser.quit();

    }
}