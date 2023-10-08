package org.example.homework.homework_16;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.List;

public abstract class AbstractCoursesPage {

    protected static final String PROTOCOL = "https://";
    protected static final String DOMAIN = "ithillel.ua";
    protected static final String COURSES = "/courses";
    private static final String OPPORTUNITY_TITLE_CSS_SELECTOR = "p[class=\"opportunity-item_title p-xl\"]";
    private static final String OPPORTUNITIES_CSS_SELECTOR = "p[class=\"opportunity-item_title p-l\"]";

    protected List<SelenideElement> courses;
    private SelenideElement opportunityTitle;
    private List<SelenideElement> opportunities;
    private SelenideElement categoryTab;

    public abstract void goToPage();

    public void getOpportunities() {
        int i = 1;
        opportunityTitle = Selenide.$(OPPORTUNITY_TITLE_CSS_SELECTOR);
        opportunities = Selenide.elements(OPPORTUNITIES_CSS_SELECTOR);
        System.out.println(opportunityTitle.getText());
        for (SelenideElement opportunity:opportunities) {
            System.out.println(i + ". " + opportunity.getText());
            i++;
        }
    }
    public void goToCategory(Category category) {
        categoryTab = Selenide.$("li.categories_item a[href*=\"" + category.getCategory() + "\"]");
        categoryTab.shouldHave(Condition.visible);
        categoryTab.click();
    }


}
