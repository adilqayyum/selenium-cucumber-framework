package com.web.automatedtest.infrastructure.driver;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Setup {

    public static WebDriver driver;

    @Before
    public void setWebDriver() throws Exception {

        String browser = System.getProperty("browser");
        if (browser == null) {
            browser = "chrome";
        }
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver",
                        "src\\test\\resources\\drivers\\chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("['start-maximized']");
                driver = new ChromeDriver(chromeOptions);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver",
                        "src\\test\\resources\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
    }
}
