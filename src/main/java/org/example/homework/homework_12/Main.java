package org.example.homework.homework_12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager chromedriverManager = WebDriverManager.chromedriver();
        chromedriverManager.setup();
        WebDriver driver = chromedriverManager.create();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://ithillel.ua/");
        Thread.sleep(1000);

        WebElement programming = driver.findElement(By
                .xpath("//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div/ul/li[1]/a"));
        programming.click();
        Thread.sleep(1000);

        WebElement frontendBasic = driver.findElement(By
                .xpath("//*[@id=\"categories\"]/div[3]/div/ul/li[1]/div/div[1]/ul/li[1]/a"));
        frontendBasic.click();
        Thread.sleep(1000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement coachesShowAllButton = wait.until(
                (webDriver) -> {js.executeScript("window.scrollBy(0, 150);");
                    return driver.findElement(By.id("coachesShowAllButton"));
                });

        new WebDriverWait(driver, Duration.ofSeconds(3)).ignoring(ElementClickInterceptedException.class).until(
                (webDriver) -> {
                    js.executeScript("window.scrollBy(0, 150);");
                    coachesShowAllButton.click();
                    return true;
                }
        );
        Thread.sleep(1000);

        List<WebElement> coaches = driver.findElements(By.className("coach-card_name"));
        for (WebElement coach: coaches) {
            System.out.println(coach.getText());
        }

        driver.quit();
    }
}
