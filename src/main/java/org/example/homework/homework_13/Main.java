package org.example.homework.homework_13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager chromedriverManager = WebDriverManager.chromedriver();
        chromedriverManager.setup();
        WebDriver driver = chromedriverManager.create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        TestingCoursesPage testingCoursesPage = new TestingCoursesPage(driver);

        testingCoursesPage.goToTestingCoursesPage();

        testingCoursesPage.getCourses();
        System.out.println();

        testingCoursesPage.getAdditionalCourses();
        System.out.println();

        testingCoursesPage.getOpportunities();
        System.out.println();

        testingCoursesPage.goToCategory("programming");
        testingCoursesPage.goToCategory("management");
        testingCoursesPage.goToCategory("marketing");
        testingCoursesPage.goToCategory("design");
        testingCoursesPage.goToCategory("kids");

        driver.quit();
    }
}
