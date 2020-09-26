package com.web.automatedtest.basepage;

import com.web.automatedtest.infrastructure.driver.Setup;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        this.driver = Setup.driver;
    }
}
