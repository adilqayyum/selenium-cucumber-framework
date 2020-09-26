package com.web.automatedtest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/Home_page.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        glue = {"com.web.automatedtest.infrastructure.driver",
                "com.web.automatedtest.homepage"})
public class HomePageTest {
}
