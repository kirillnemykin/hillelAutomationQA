package org.example.homework.homework_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestingCoursesPage {

    private static final String TESTING_COURSES_PAGE_URL = "https://ithillel.ua/courses/testing";
    private static final By COURSES_CSS_SELECTOR
            = By.cssSelector("div.block-profession_group:not(div.block-profession_group:last-child) p.profession-bar_title");
    private static final By ADDITIONAL_COURSES_CSS_SELECTOR
            = By.cssSelector("div.block-profession_group:last-child p.profession-bar_title");
    private static final By OPPORTUNITY_TITLE_CSS_SELECTOR
            = By.cssSelector("p[class=\"opportunity-item_title p-xl\"]");
    private static final By OPPORTUNITIES_CSS_SELECTOR
            = By.cssSelector("p[class=\"opportunity-item_title p-l\"]");
    private static final By PROGRAMMING_CSS_SELECTOR
            = By.cssSelector("li.categories_item a[href*=\"programming\"]");
    private static final By MANAGEMENT_CSS_SELECTOR
            = By.cssSelector("li.categories_item a[href*=\"management\"]");
    private static final By MARKETING_CSS_SELECTOR
            = By.cssSelector("li.categories_item a[href*=\"marketing\"]");
    private static final By DESIGN_CSS_SELECTOR
            = By.cssSelector("li.categories_item a[href*=\"design\"]");
    private static final By KIDS_CSS_SELECTOR
            = By.cssSelector("li.categories_item a[href*=\"kids\"]");

    private WebDriver driver;
    private List<WebElement> courses;
    private List<WebElement> additionalCourses;
    private WebElement opportunityTitle;
    private List<WebElement> opportunities;
    private WebElement programming;
    private WebElement management;
    private WebElement marketing;
    private WebElement design;
    private WebElement kids;

    public TestingCoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToTestingCoursesPage() {
        driver.get(TESTING_COURSES_PAGE_URL);
    }

    public void getCourses() {
        int i = 1;
        courses = driver.findElements(COURSES_CSS_SELECTOR);
        System.out.println("=====Testing Courses:=====");
        for (WebElement course:courses) {
            System.out.println(i + ". " + course.getText());
            i++;
        }
    }

    public void getAdditionalCourses() {
        int i = 1;
        additionalCourses = driver.findElements(ADDITIONAL_COURSES_CSS_SELECTOR);
        System.out.println("=====Additional Courses:=====");
        for (WebElement additionalCourse:additionalCourses) {
            System.out.println(i + ". " + additionalCourse.getText());
            i++;
        }
    }

    public void getOpportunities() {
        int i = 1;
        opportunityTitle = driver.findElement(OPPORTUNITY_TITLE_CSS_SELECTOR);
        opportunities = driver.findElements(OPPORTUNITIES_CSS_SELECTOR);
        System.out.println(opportunityTitle.getText());
        for (WebElement opportunity:opportunities) {
            System.out.println(i + ". " + opportunity.getText());
            i++;
        }
    }

    public void goToCategory(String category) throws InterruptedException {
        goToTestingCoursesPage();
        if (category.equalsIgnoreCase("programming")) {
            programming = driver.findElement(PROGRAMMING_CSS_SELECTOR);
            programming.click();
            Thread.sleep(1000);
        } else if (category.equalsIgnoreCase("management")) {
            management = driver.findElement(MANAGEMENT_CSS_SELECTOR);
            management.click();
            Thread.sleep(1000);
        } else if (category.equalsIgnoreCase("marketing")) {
            marketing = driver.findElement(MARKETING_CSS_SELECTOR);
            marketing.click();
            Thread.sleep(1000);
        } else if (category.equalsIgnoreCase("design")) {
            design = driver.findElement(DESIGN_CSS_SELECTOR);
            design.click();
            Thread.sleep(1000);
        } else if (category.equalsIgnoreCase("kids")) {
            kids = driver.findElement(KIDS_CSS_SELECTOR);
            kids.click();
            Thread.sleep(1000);
        } else System.out.println("Category doesn't exist");
    }
}
