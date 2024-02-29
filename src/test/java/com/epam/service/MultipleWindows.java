package com.epam.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleWindows {
    public boolean multipleWindows(WebDriver webDriver){
        webDriver.get("http://the-internet.herokuapp.com/windows");
        boolean isnewWindow=false;
        //WebElement webElement= webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
        String originalWindow=webDriver.getWindowHandle(); //storing the id of the original window
        assert webDriver.getWindowHandles().size()==1;
        webDriver.findElement(By.linkText("Click Here")).click();
        for(String window: webDriver.getWindowHandles()){
            if(!originalWindow.contentEquals(window)){
                webDriver.switchTo().window(window);
                isnewWindow=true;
                break;
            }
        }
        return isnewWindow;
    }
}
