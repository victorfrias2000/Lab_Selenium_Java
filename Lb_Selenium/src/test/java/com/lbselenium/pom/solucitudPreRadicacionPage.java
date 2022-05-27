package com.lbselenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class solucitudPreRadicacionPage extends utilitycalss_selenium{

    @FindBy(name = "company")
    WebElement cboCompania;
    @FindBy(name = "type_psss")
    WebElement cboTipoPss;
    @FindBy(name = "")
    WebElement codigoPss;



    public solucitudPreRadicacionPage(WebDriver driver) {
        super(driver);
    }
}
