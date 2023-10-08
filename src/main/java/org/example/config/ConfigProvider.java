package org.example.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class ConfigProvider {
    private static final Properties properties = initProperties();

    private static Properties initProperties() {
        Properties properties = new Properties();
        try {
            properties.load(ClassLoader.getSystemResourceAsStream("config.properties"));
        } catch (IOException e) {
            throw new IllegalArgumentException("Could not read a file");
        }
        return properties;
    }

    public static int timeout() {
        return Integer.parseInt(properties.getProperty("timeout"));
    }

    public static WebDriver getDriver() {
        String browserName = System.getenv("browser") == null ?
                properties.getProperty("browser") : System.getenv("browser");

        WebDriver browser = switch (browserName.toLowerCase()) {
            case "chrome" -> WebDriverManager.chromedriver().create();
            case "firefox" -> WebDriverManager.firefoxdriver().create();
            default -> throw new IllegalArgumentException("Unsupported browser");
        };
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout()));

        return browser;
    }

    public static String getBaseUrl() {
        return properties.getProperty("base.url");
    }
}
