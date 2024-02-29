package com.epam.service;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

public class Alerts {
    public void validatingAlerts(WebDriver webDriver) {
        webDriver.get("http://the-internet.herokuapp.com/javascript_alerts");
        WebElement alertForJSAlert = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
        alertForJSAlert.click();
        Alert alertJSAlert=webDriver.switchTo().alert();
        String alertText= alertJSAlert.getText();
        System.out.println("JS ALERT TEXT:"+" "+alertText);
        alertJSAlert.accept();
        //---------------
        new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(3000))
                .ignoring(ElementNotInteractableException.class);
        WebElement alertForJSConfirm = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        alertForJSConfirm.click();
        Alert alertJSConfirm=webDriver.switchTo().alert();
        String alertJSConfirmTextText= alertJSConfirm.getText();
        System.out.println("JS ALERT TEXT:"+" "+alertJSConfirmTextText);
        alertJSConfirm.accept(); //clicked on ok
        //----------------
        new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(3000))
                .ignoring(ElementNotInteractableException.class);
        WebElement alertforJSPrompt=webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        alertforJSPrompt.click();
        Alert alertJSPrompt=webDriver.switchTo().alert();
        alertJSPrompt.sendKeys("yes");
        alertJSPrompt.accept();
        new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(3000))
                .ignoring(ElementNotInteractableException.class);
    }
}
