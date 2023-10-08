import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.MainHillelPage;
import org.example.config.ConfigProvider;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainHillelPageTest {

    private WebDriver browser;
    private MainHillelPage page;

    @BeforeClass
    @BeforeAll
    static void beforeClass() {
        System.out.println("before class");
    }

    @BeforeTest
    @BeforeEach
    void setup() {
        browser = ConfigProvider.getDriver();
        page = new MainHillelPage(browser);
    }

    @Test
    @org.junit.jupiter.api.Test
    void goToPageTest() {
        String expectedContains = "школа Hillel Online";
        setup();

        page.goToPage();

        Assert.assertTrue(page.getTitle().contains(expectedContains));
    }

    @Test
    @org.junit.jupiter.api.Test
    void clickLeftMouseContactsButtonTest() {
        setup();
        String expectedContains = "Контакти";

        var contactPage = page.clickContactsButton();

        Assert.assertTrue(contactPage.getTitle().contains(expectedContains));
    }

    @Test
    void clickRightMouseContactsButtonTest() {
        page.clickContactsButton();
    }
}
