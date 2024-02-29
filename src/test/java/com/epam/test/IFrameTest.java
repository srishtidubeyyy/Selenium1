package com.epam.test;

import com.epam.browserFactory.BrowserFactory;
import com.epam.service.IFrame;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class IFrameTest {
    IFrame iFrame;
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser){
        driver=BrowserFactory.getBrowser(browser);
        iFrame=new IFrame();
    }
    @Test
    public void validating(){
        Assert.assertEquals(iFrame.iframeVerification(driver),"Hi there again");
    }
    @AfterTest
    public void closing(){
        driver.close();
    }
    @AfterSuite
    public void clearingUp(){
        driver.quit();
    }
}
