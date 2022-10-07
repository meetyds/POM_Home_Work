package com.demo.nopcommerce;

import com.demo.nopcommerce.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class BasePageTest {
    WebDriver driver;
    BasePage basePage;
    Properties prop;

    @Test
    public void openBrowser(){
        basePage=new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
    }
}
