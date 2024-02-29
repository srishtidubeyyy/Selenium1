package com.epam.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrame {
    public String iframeVerification(WebDriver webDriver){
        webDriver.get("http://the-internet.herokuapp.com/tinymce");
        webDriver.manage().window().fullscreen();
        webDriver.switchTo().frame("mce_0_ifr");
        WebElement webElement= webDriver.findElement(By.id("tinymce"));
        webElement.clear();
        webElement.sendKeys("Hi there");
        webElement.clear();
        webElement.sendKeys("Hi there again");
        String content=webElement.getText();
        webDriver.switchTo().defaultContent();
        return content;
    }
}
