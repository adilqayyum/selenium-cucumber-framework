package com.web.automatedtest.homepage;

import com.web.automatedtest.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class HomePage extends BasePage{

    @FindBy(className = "babbel-logo")
    private WebElement logo;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/section[2]/div[2]/div[2]/div[2]/a")
    private WebElement learningButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div/section[2]/div[2]/div[2]/div[1]/button")
    private  WebElement languagePicker;

    HomePage() {
        PageFactory.initElements(driver, this);
    }

    void goToPage(String url){
        driver.get(url);
        wait.forLoading(Duration.ofSeconds(5));
    }

    void checkLogoDisplay() {
        wait.forElementToBeDisplayed(Duration.ofSeconds(5), this.logo, "Logo");
    }
    String getTitle() {
        return driver.getTitle();
    }

    void clickOnStartLearning() {
        wait.forElementToBeDisplayed(Duration.ofSeconds(10), this.learningButton, "Start Learning");
        this.learningButton.click();
        wait.forLoading(Duration.ofSeconds(10));
    }

    void clickOnLanguagePicker() {
        wait.forElementToBeDisplayed(Duration.ofSeconds(10), this.languagePicker, "Language Picker");
        this.languagePicker.click();
    }

    void clickOnValue(String spanText) {
        WebElement textElement = driver.findElement(
                By.xpath("//*[@class='language-picker-component']//*[contains(text(), '"+spanText+"')]"));
        wait.forElementToBeDisplayed(Duration.ofSeconds(20), textElement,
                "Span Value");
        textElement.click();
    }

    void selectText(String labelText) {
        WebElement textElement = driver.findElement(
                By.xpath("//*[@class='questions-page-container']//*[contains(text(), '"+labelText+"')]"));
        wait.forElementToBeDisplayed(Duration.ofSeconds(20), textElement,
                "Label Value");
        textElement.click();
    }
}
