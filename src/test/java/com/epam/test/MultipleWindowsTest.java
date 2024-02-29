package com.epam.test;

import com.epam.browserFactory.BrowserFactory;
import com.epam.service.MultipleWindows;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class MultipleWindowsTest {
    MultipleWindows multipleWindows;
    WebDriver webDriver;
    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser){
        webDriver= BrowserFactory.getBrowser(browser);
        multipleWindows=new MultipleWindows();
    }
    @Test
    public void validatingMultipleWindows(){
        Assert.assertTrue(multipleWindows.multipleWindows(webDriver));
    }
    @AfterTest
    public void closing(){
        webDriver.close();
    }
    @AfterSuite
    public void tearDown(){
        webDriver.quit();
    }
}
