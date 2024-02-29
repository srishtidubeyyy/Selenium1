package com.epam.browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser{
    private static WebDriver instance;
    private EdgeBrowser() {}
    public static synchronized WebDriver getInstance() {
        if (instance == null) {
            instance = new EdgeDriver();
        }
        return instance;
    }


}
