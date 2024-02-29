package com.epam.browserFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserFactory {
   public static WebDriver getBrowser(String browser) {
       switch (browser.toLowerCase()) {
           case "chrome":
               return  ChromeBrowser.getInstance();
           case "edge":
               return  EdgeBrowser.getInstance();
           case "firefox":
               return  FirefoxBrowser.getInstance();
           default:
               throw new InvalidBrowserTypeException("Invalid browser type: " + browser);
       }
   }
}
