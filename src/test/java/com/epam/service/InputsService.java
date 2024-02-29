package com.epam.service;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.stream.IntStream;

public class InputsService {

    public WebElement enteringInput(WebDriver webDriver) throws InterruptedException {
        webDriver.get("http://the-internet.herokuapp.com/inputs");
        webDriver.manage().window().fullscreen();
        Thread.sleep(3000);
        WebElement inputField = webDriver.findElement(By.xpath("//*[@id='content']/div/div/div/input"));
        Thread.sleep(2000);
        inputField.clear();
        inputField.sendKeys("3");
        Thread.sleep(2000);
        inputField.sendKeys(Keys.ENTER);
        return inputField;
    }

    public String initialValue(WebDriver webDriver) throws InterruptedException {
        WebElement initialElement = enteringInput(webDriver);
        Thread.sleep(2000);
        String initialValue = initialElement.getAttribute("value");
        return initialValue;
    }

    public String valueAfterUpKey(WebDriver webDriver) throws InterruptedException {
        WebElement element = enteringInput(webDriver);
        Thread.sleep(2000);
        element.sendKeys(Keys.ARROW_UP);
        Thread.sleep(2000);
        String valueAfterArrowUp = element.getAttribute("value");
        return valueAfterArrowUp;
    }

    public String valueAfterDownKey(WebDriver webDriver) throws InterruptedException {
        WebElement webElement = enteringInput(webDriver);
        Thread.sleep(2000);
        webElement.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        String valueAfterArrowDown = webElement.getAttribute("value");
        return valueAfterArrowDown;
    }

    public String increaseValue(WebElement webElement, int limit) {
        IntStream.range(0, limit)
                .forEach(i -> webElement.sendKeys(Keys.ARROW_UP));
        return webElement.getAttribute("value");
    }

    public String decreaseValue(WebElement webElement, int limit) {
        IntStream.range(0, limit)
                .forEach(i -> webElement.sendKeys(Keys.ARROW_DOWN));
        return webElement.getAttribute("value");
    }

}
