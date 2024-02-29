package com.epam.test;

import com.epam.browserFactory.BrowserFactory;
import com.epam.service.NestedFrames;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NestedFramesTest {
    NestedFrames nestedFrames;
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser){
        driver= BrowserFactory.getBrowser(browser);
        nestedFrames=new NestedFrames();
    }
    @Test
    public void validatingNestedFrames(){
        nestedFrames.nestedFrames(driver);
    }
    @AfterTest
    public void closing(){
        driver.close();
    }
}
