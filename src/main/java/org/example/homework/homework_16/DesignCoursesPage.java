package org.example.homework.homework_16;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class DesignCoursesPage extends AbstractCoursesPage {
    private static final String DESIGN = "/design";
    private static final String COURSES_CSS_SELECTOR = "p.profession-bar_title";

    @Override
    public void goToPage() {
        Selenide.open(PROTOCOL + DOMAIN + COURSES + DESIGN);
    }

    public void getCourses() {
        int i = 1;
        courses = Selenide.elements(COURSES_CSS_SELECTOR);
        System.out.println("=====Design Courses:=====");
        for (SelenideElement course:courses) {
            System.out.println(i + ". " + course.getText());
            i++;
        }
    }

}
