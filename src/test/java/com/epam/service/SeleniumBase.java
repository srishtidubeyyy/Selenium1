package com.epam.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumBase {
    public String testingInputTextFunctionality(WebDriver webDriver){
        webDriver.get("https://seleniumbase.io/demo_page");
        webDriver.manage().window().fullscreen();
        WebElement element= webDriver.findElement(By.id("myTextInput2"));
        element.clear();
        element.sendKeys("java");
        return element.getAttribute("value");

    }
    public String testingIFrameText(WebDriver webDriver, String id){
        webDriver.get("https://seleniumbase.io/demo_page");
        webDriver.manage().window().fullscreen();
        WebElement iframeElement = webDriver.findElement(By.id(id));
        webDriver.switchTo().frame(iframeElement);
        webDriver.switchTo().defaultContent();
        return webDriver.findElement(By.xpath("/html/body/h4")).getText();


    }
}
