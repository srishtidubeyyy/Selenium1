package com.epam.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HerokuService {
    public String checkingRefreshFunctionality(WebDriver webDriver) throws InterruptedException {
        webDriver.get("http://the-internet.herokuapp.com/dynamic_content");
        webDriver.manage().window().fullscreen();
        WebElement title= webDriver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]"));
        String titleContent=title.getText();
        webDriver.navigate().refresh();
        WebDriverWait wait= new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(title,titleContent)));
        String updatedText=title.getText();
        return updatedText;
    }
}
