package com.epam.test;

import com.epam.browserFactory.BrowserFactory;
import com.epam.service.CheckBox;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckBoxTest {
    CheckBox checkBox;
    WebDriver driver;
    @BeforeTest()
    @Parameters("browser")
    public void setUp(String browser){
       driver= BrowserFactory.getBrowser(browser); //pass it as a parameter in test ng or use resource file to allocate browser
        checkBox=new CheckBox();
    }
    @Test
    public void validatingCheckBoxIsSelected() throws InterruptedException {
        Assert.assertTrue(checkBox.testingCheckBoxFunctionality(driver));
        Thread.sleep(3000);
    }
    @AfterSuite
    public void clearingUp(){
        driver.quit();
    }
}
