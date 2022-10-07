package com.demo.nopcommerce.Pages;

import com.demo.nopcommerce.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    WebDriver driver;
    Utils utils;
    By reglink = By.className("ico-register");
    By gender = By.id("gender-male");
    By fname = By.id("FirstName");
    By lname = By.id("LastName");
    By day = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    private String value;
    By emailid = By.id("Email");
    By password = By.id("Password");
    By cnfpassword = By.id("ConfirmPassword");
    By companyName = By.id("Company");
    By regButton = By.xpath("//*[@id=\"register-button\"]");

    public RegistrationPage(WebDriver driver){
        this.driver=driver;
        utils = new Utils(driver);
    }
    public void clickonRegLink() {
        utils.doClick(reglink);
        utils.doClick(gender);
    }
 /*   public void select(String Day){
        day = By.id(Day);
        this.value = value;
        utils.doSelect(day,Day);
    }*/
    public void doRegister(String FirstName,String LastName,String Email,String Password,String ConfirmPassword,String CmpName) {
        // utils.doSendKey(gender,Gender);
        utils.doSendKey(fname,FirstName);
        utils.doSendKey(lname,LastName);
        utils.doSendKey(emailid,Email);
        utils.doSendKey(password,Password);
        utils.doSendKey(cnfpassword,ConfirmPassword);
        utils.doSendKey(companyName,CmpName);
        utils.doClick(regButton);
    }
}
