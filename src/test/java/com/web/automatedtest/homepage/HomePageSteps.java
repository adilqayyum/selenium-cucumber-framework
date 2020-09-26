package com.web.automatedtest.homepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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

}
