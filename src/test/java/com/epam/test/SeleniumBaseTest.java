package com.epam.test;

import com.epam.browserFactory.BrowserFactory;
import com.epam.service.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumBaseTest {
   SeleniumBase seleniumBase;
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser){
       driver= BrowserFactory.getBrowser(browser);
      seleniumBase=new SeleniumBase();
    }
    @Test
    public void validatingInputtext(){
        Assert.assertEquals(seleniumBase.testingInputTextFunctionality(driver),"java");
    }
    @AfterTest
    public void closing(){
        driver.close();;
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
