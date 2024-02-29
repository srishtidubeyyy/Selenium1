package com.epam.test;

import com.epam.browserFactory.BrowserFactory;
import com.epam.service.HerokuService;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HerokuTest {
    HerokuService herokuService;
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser){
        driver= BrowserFactory.getBrowser(browser);
        herokuService=new HerokuService();
    }
    @Test
    public void validatingPageRefresh() throws InterruptedException {
        Assert.assertNotEquals(herokuService.checkingRefreshFunctionality(driver),"updated Text");
    }
}
