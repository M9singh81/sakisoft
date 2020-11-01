package com.swaglabs.qademo.bdd;

import com.swaglabs.qademo.page.LandingPage;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommonSteps {
    @Autowired
    LandingPage landingPage;

    @Given("I am on google page")
    public void iAmOnGooglePage() {
        landingPage.navigateToPage();
    }
}
