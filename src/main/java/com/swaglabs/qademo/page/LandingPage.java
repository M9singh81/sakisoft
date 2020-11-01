package com.swaglabs.qademo.page;

import com.swaglabs.qademo.utility.WebDriverHelper;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LandingPage {
    private final By USERNAME_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("login-button");

    @Autowired
    WebDriverHelper wdHelper;

    @Value("${url}")
    private String url;

    public void navigateToPage(){
        wdHelper.navigateToUrl(url);
    }
}
