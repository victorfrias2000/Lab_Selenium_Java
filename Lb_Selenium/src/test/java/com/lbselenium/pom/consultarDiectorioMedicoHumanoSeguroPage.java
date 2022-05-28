package com.lbselenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class consultarDiectorioMedicoHumanoSeguroPage {

    //declaracon de los WebElement
    @FindBy(xpath = "//ul[@class='pull-right']/li[2]/a")
    private WebElement linkDirectorioMedico;
    @FindBy(id = "selTipoProv")
    private WebElement seltTipoProveedor;
    @FindBy(xpath = "//*[@id=/divCargando/]/div/div/div")
    private WebElement londing;

    // private final WebDriverWait wait;
    private WebDriver driver;

    //constructor de la clase
    public consultarDiectorioMedicoHumanoSeguroPage(WebDriver driver) {
        // wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver, this);
    }

    public void cliclinkDirectorioMedico() {
        // linkDirectorioMedico.click();
    }

    public void BusquedaDirectorio() {
        // wait.until(ExpectedConditions.elementToBeClickable(londing));
        seltTipoProveedor.click();
    }

    public void acceptPopup() {

    }


}
