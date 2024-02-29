package com.epam.browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser{
    private static WebDriver instance;
    private  ChromeBrowser() {}
    public static synchronized WebDriver getInstance() {
        if (instance == null) {
            instance = new ChromeDriver();
        }
        return instance;
    }


}
