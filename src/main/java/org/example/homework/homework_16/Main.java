package org.example.homework.homework_16;

import com.codeborne.selenide.Selenide;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ProgrammingCoursesPage programmingCoursesPage = new ProgrammingCoursesPage();
        programmingCoursesPage.goToPage();
        Thread.sleep(1000);

        programmingCoursesPage.getCourses(ProgrammingLanguage.FRONTEND);
        System.out.println();

        programmingCoursesPage.getAdditionalCourses(ProgrammingLanguage.FRONTEND);
        System.out.println();

        programmingCoursesPage.getCourses(ProgrammingLanguage.JAVA);
        System.out.println();

        programmingCoursesPage.getAdditionalCourses(ProgrammingLanguage.JAVA);
        System.out.println();

        programmingCoursesPage.getCourses(ProgrammingLanguage.PHP);
        System.out.println();

        programmingCoursesPage.getCourses(ProgrammingLanguage.PYTHON);
        System.out.println();

        programmingCoursesPage.getCourses(ProgrammingLanguage.DEVOPS);
        System.out.println();

        programmingCoursesPage.getCourses(ProgrammingLanguage.DATASCIENCE);
        System.out.println();

        programmingCoursesPage.getCourses(ProgrammingLanguage.CSHARP);
        System.out.println();

        programmingCoursesPage.getCourses(ProgrammingLanguage.JAVASCRIPT);
        System.out.println();

        programmingCoursesPage.getCourses(ProgrammingLanguage.FULLSTACK);
        System.out.println();

        programmingCoursesPage.getOpportunities();
        System.out.println();

        programmingCoursesPage.goToCategory(Category.TESTING);
        Thread.sleep(1000);

        Selenide.closeWebDriver();

        TestingCoursesPage testingCoursesPage = new TestingCoursesPage();
        testingCoursesPage.goToPage();
        Thread.sleep(1000);

        testingCoursesPage.getCourses();
        System.out.println();

        testingCoursesPage.getAdditionalCourses();
        System.out.println();

        testingCoursesPage.getOpportunities();
        System.out.println();

        testingCoursesPage.goToCategory(Category.MANAGEMENT);
        Thread.sleep(1000);

        Selenide.closeWebDriver();

        DesignCoursesPage designCoursesPage = new DesignCoursesPage();
        designCoursesPage.goToPage();
        Thread.sleep(1000);

        designCoursesPage.getCourses();
        System.out.println();

        designCoursesPage.getOpportunities();
        System.out.println();

        designCoursesPage.goToCategory(Category.MARKETING);
        Thread.sleep(1000);

        designCoursesPage.goToCategory(Category.DESIGN);
        Thread.sleep(1000);

        designCoursesPage.goToCategory(Category.KIDS);
        Thread.sleep(1000);

        designCoursesPage.goToCategory(Category.PROGRAMMING);
        Thread.sleep(1000);

        Selenide.closeWebDriver();

    }
}
