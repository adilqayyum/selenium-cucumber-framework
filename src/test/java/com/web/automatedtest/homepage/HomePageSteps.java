package com.web.automatedtest.homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomePageSteps {


    private final HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^A user navigates to URL \"([^\"]*)\"$")
    public void aUserNavigatesToURL(String url) {
        this.homePage.goToPage(url);
    }

    @Then("^Babbel logo is displayed$")
    public void babbelLogoIsDisplayed() {
        this.homePage.checkLogoDisplay();
    }
    @And("^Click on Start Learning$")
    public void clickOnStartLearningButton() {
        this.homePage.clickOnStartLearning();
    }

    @And("^Click on Language Picker$")
    public void clickOnLanguagePickerButton() {
        this.homePage.clickOnLanguagePicker();
    }

    @And("^Click on Dropdown Value \"([^\"]*)\"$")
    public void clickOnValue(String value) {
        this.homePage.clickOnValue(value);
    }

    @And("^Select Form Value \"([^\"]*)\"$")
    public void selectText(String value) {
        this.homePage.selectText(value);
    }

    @Then("^page title is \"([^\"]*)\"$")
    public void pageTitleIs(String title) {
        String displayedTitle = this.homePage.getTitle();
        Assert.assertEquals("Displayed title is " + displayedTitle +
                " instead of " + title, title, displayedTitle);
    }
}
