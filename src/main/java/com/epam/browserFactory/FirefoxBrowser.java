package com.epam.browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser{
    private static WebDriver instance;

   private FirefoxBrowser() {}
    public static synchronized WebDriver getInstance() {
        if (instance == null) {
            instance = new FirefoxDriver();
        }
        return instance;
    }

}
