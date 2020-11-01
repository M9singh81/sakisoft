package com.swaglabs.qademo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WebDriverHelper {
    private final Integer MIN_COUNT = 1;

    @Autowired
    WebDriver driver;

    @Autowired
    WebDriverWait wait;


    /**
     * navigate to given url
     * @param url
     */
    public void navigateToUrl(String url){
        driver.get(url);
    }

    /**
     * wait for element to clickable and perform click
     * @param elementIdentifier
     */
    public void click(By elementIdentifier){
        wait.until(ExpectedConditions.elementToBeClickable(elementIdentifier));
        driver.findElement(elementIdentifier).click();
    }

    /**
     * wait for element to be visible and then enter the given value
     * @param elementIdentifier
     * @param value
     */
    public void sendKeys(By elementIdentifier, String value){
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementIdentifier));
        driver.findElement(elementIdentifier).sendKeys(value);
    }

    /**
     * wait for element to be visible and then choose the option as given value
     * @param elementIdentifier
     * @param value
     */
    public void selectOptionByValue(By elementIdentifier, String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementIdentifier));
        new Select(driver.findElement(elementIdentifier)).selectByValue(value);
    }

    /**
     * wait for element to be more than min count and return list of elements
     * @param elementIdentifier
     * @return
     */
    public List<WebElement> getElements(By elementIdentifier){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(elementIdentifier, MIN_COUNT));
        return driver.findElements(elementIdentifier);
    }

    /**
     * wait for element to be more than min count and return the count of elements
     * @param elementIdentifier
     * @return
     */
    public int getElementsCount(By elementIdentifier){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(elementIdentifier, MIN_COUNT));
        return driver.findElements(elementIdentifier).size();
    }

    /**
     * wait for element to be visible and return the text
     * @param elementIdentifier
     * @return
     */
    public String getText(By elementIdentifier){
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementIdentifier));
        return driver.findElement(elementIdentifier).getText();
    }
}
