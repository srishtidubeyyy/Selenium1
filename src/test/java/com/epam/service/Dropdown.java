package com.epam.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public String testingDropdown(WebDriver webDriver) throws InterruptedException {
        webDriver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = webDriver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown); //select object to perform various selection operations
        WebElement defaultSelectedOption = select.getFirstSelectedOption();
        System.out.println("Default Selected Option: " + defaultSelectedOption.getText());
        Thread.sleep(3000);
        select.selectByVisibleText("Option 2");
        Thread.sleep(3000);
        WebElement selectedOption = select.getFirstSelectedOption();
        System.out.println("Selected Option: " + selectedOption.getText());
        Thread.sleep(3000);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByValue("2");
        return selectedOption.getText();
    }
}
