package org.example.homework.homework_16;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.List;

public class TestingCoursesPage extends AbstractCoursesPage {
    private static final String TESTING = "/testing";
    private static final String COURSES_CSS_SELECTOR
            = "div.block-profession_group:not(div.block-profession_group:last-child) p.profession-bar_title";
    private static final String ADDITIONAL_COURSES_CSS_SELECTOR
            = "div.block-profession_group:last-child p.profession-bar_title";
    private List<SelenideElement> additionalCourses;

    @Override
    public void goToPage() {
        Selenide.open(PROTOCOL + DOMAIN + COURSES + TESTING);
    }

    public void getCourses() {
        int i = 1;
        courses = Selenide.elements(COURSES_CSS_SELECTOR);
        System.out.println("=====Testing Courses:=====");
        for (SelenideElement course:courses) {
            System.out.println(i + ". " + course.getText());
            i++;
        }
    }

    public void getAdditionalCourses() {
        int i = 1;
        additionalCourses = Selenide.elements(ADDITIONAL_COURSES_CSS_SELECTOR);
        System.out.println("=====Additional Courses:=====");
        for (SelenideElement additionalCourse:additionalCourses) {
            System.out.println(i + ". " + additionalCourse.getText());
            i++;
        }
    }
}
