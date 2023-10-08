package org.example.homework.homework_16;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.List;

public class ProgrammingCoursesPage extends AbstractCoursesPage {
    private static final String PROGRAMMING = "/programming";
    private static final String ADDITIONAL_COURSES_CSS_SELECTOR
            = "li.profession_item[data-for=\"front-end\"] div.block-profession_group:last-child p.profession-bar_title";
    private String coursesCssSelector;
    private SelenideElement languageTab;
    private List<SelenideElement> additionalCourses;

    @Override
    public void goToPage() {
        Selenide.open(PROTOCOL + DOMAIN + COURSES + PROGRAMMING);
    }

    public void getCourses(ProgrammingLanguage language) {
        if (language.equals(ProgrammingLanguage.FRONTEND)) {
            coursesCssSelector = "li.profession_item[data-for=\""
                    + language.getLanguage()
                    + "\"] div.block-profession_group:not(div.block-profession_group:last-child) p.profession-bar_title";
        } else {
            coursesCssSelector = "li.profession_item[data-for=\""
                    + language.getLanguage()
                    + "\"] p.profession-bar_title";
        }

        languageTab = Selenide.$("button[data-id=\"" + language.getLanguage() + "\"]");
        languageTab.shouldHave(Condition.visible);
        languageTab.click();

        int i = 1;
        courses = Selenide.elements(coursesCssSelector);
        System.out.println("=====Programming Courses:=====");
        for (SelenideElement course:courses) {
            System.out.println(i + ". " + course.getText());
            i++;
        }
    }

    public void getAdditionalCourses(ProgrammingLanguage language) {
        if (language.equals(ProgrammingLanguage.FRONTEND)) {
            int i = 1;
            additionalCourses = Selenide.elements(ADDITIONAL_COURSES_CSS_SELECTOR);
            System.out.println("=====Additional Courses:=====");
            for (SelenideElement additionalCourse:additionalCourses) {
                System.out.println(i + ". " + additionalCourse.getText());
                i++;
            }
        } else {
            System.out.println("There are no additional courses for this language");
        }
    }
}
