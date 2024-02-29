package com.epam.test;

import com.epam.browserFactory.BrowserFactory;
import com.epam.service.Dropdown;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DropdownTest {
    Dropdown dropdown;
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser){
        driver= BrowserFactory.getBrowser(browser); //pass it as a parameter in test ng or use resource file to allocate browser
        dropdown=new Dropdown();
    }
    @Test
    public void validatingAlerts() throws InterruptedException {
        Assert.assertEquals(dropdown.testingDropdown(driver),"Option 2");
    }
//    @AfterTest
//    public void closing(){
//        driver.close();
//    }
    @AfterSuite
    public void teardown(){
        driver.quit();
    }
}
