package com.web.automatedtest.homepage;

import com.web.automatedtest.basepage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage{

    @FindBy(className = "babbel-logo")
    private WebElement logo;

    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToPage(String url){
        driver.get(url);
        wait.forLoading(5);
    }

    void checkLogoDisplay() {
        wait.forElementToBeDisplayed(5, this.logo, "Logo");
    }
}
