package com.epam.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
    public boolean testingCheckBoxFunctionality(WebDriver webDriver){
        webDriver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox= webDriver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        checkBox.click();
        return checkBox.isSelected();
    }
}
