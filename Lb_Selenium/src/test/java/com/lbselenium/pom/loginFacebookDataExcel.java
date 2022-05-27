package com.lbselenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class loginFacebookDataExcel {

    //declaration elements Web
    @FindBy(id = "email")
    private WebElement Txt_email;

    @FindBy(id = "passContainer")
    private WebElement Txt_passContainer;

    @FindBy(name = "login")
    private WebElement Btn_login;

    public loginFacebookDataExcel(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @Test
    public void ReadDataExcelLoginFaceboock(String filepath, String sheetName) {


    }


}
