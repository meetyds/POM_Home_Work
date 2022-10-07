package com.demo.nopcommerce;

import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegistrationPageTest {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    RegistrationPage registrationPage;

    @BeforeMethod
    public void openBrowser(){
        basePage=new BasePage();
        prop=basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver=basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registrationPage = new RegistrationPage(driver);
    }
    @Test
    public void RegTest() throws InterruptedException {
        Thread.sleep(2000);
        registrationPage.clickonRegLink();
        registrationPage.doRegister(prop.getProperty("FirstName"),prop.getProperty("LastName"),prop.getProperty("Email"),
                prop.getProperty("Password"),prop.getProperty("CnfPassword"),prop.getProperty("CompanyName"));
        Thread.sleep(2000);
      //  registrationPage.select(prop.getProperty("Day"));
    }
    public void tearDown(){
    }
}
