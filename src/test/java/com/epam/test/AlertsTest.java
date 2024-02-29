package com.epam.test;

import com.epam.browserFactory.BrowserFactory;
import com.epam.service.Alerts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AlertsTest {
    Alerts alerts;
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser){
        driver= BrowserFactory.getBrowser(browser); //pass it as a parameter in test ng or use resource file to allocate browser
        alerts=new Alerts();
    }
    @Test
    public void validatingAlerts(){
        alerts.validatingAlerts(driver);
   }
    @AfterTest
    public void closing(){
      driver.close();
   }
}
