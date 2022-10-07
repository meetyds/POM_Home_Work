package com.demo.nopcommerce.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    WebDriver driver;
    Properties prop;
    FileInputStream file;
    public WebDriver initialiseDriver(String browserName)
    {
        if (browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        } else if (browserName.equals("Edge")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        else {
            System.out.println("Browser Not Found");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }

    public Properties initialiseProperties() {

        prop = new Properties();
        try {
            file = new FileInputStream("E:\\Unify Testing\\Automation Testing\\Page Object Model Framework\\Page_Object_Model\\src\\test\\resources\\TestData\\config.properties");
            prop.load(file);
        } catch (FileNotFoundException e){
            System.out.println("Config File is not found");
            e.printStackTrace();
        } catch(IOException e){
            System.out.println("Properties are not Loaded");
        }
        return prop;
    }

}
