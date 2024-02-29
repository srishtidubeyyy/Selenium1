package com.epam.test;

import com.epam.browserFactory.BrowserFactory;
import com.epam.service.InputsService;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class InputsTest {
    InputsService inputsService;
    WebDriver webDriver;

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) {
        inputsService = new InputsService();
        webDriver = BrowserFactory.getBrowser(browser);

    }

    @Test
    public void validatingInputField() throws InterruptedException {
        Assert.assertEquals(inputsService.enteringInput(webDriver).getAttribute("value"), "3");
    }

    @Test
    public void validatingValueAfterUpAndDown() throws InterruptedException {
        Assert.assertNotEquals(inputsService.initialValue(webDriver), inputsService.valueAfterUpKey(webDriver));
        Assert.assertNotEquals(inputsService.initialValue(webDriver), inputsService.valueAfterDownKey(webDriver));
    }

    @AfterTest
    public void closing() {
        webDriver.close();
    }

    @AfterSuite
    public void tearDown() {
        webDriver.quit();
    }
}
