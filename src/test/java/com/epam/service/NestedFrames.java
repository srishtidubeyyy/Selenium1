package com.epam.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NestedFrames {
    public void nestedFrames(WebDriver webDriver) {
        webDriver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> frames = webDriver.findElements(By.tagName("frame"));
        for (WebElement frame : frames) {
           webDriver.switchTo().frame(frame);
           String frameText=webDriver.findElement(By.tagName("body")).getText();
           System.out.println("Frame content is"+" "+frameText);
           webDriver.switchTo().defaultContent();
        }
    }
}
