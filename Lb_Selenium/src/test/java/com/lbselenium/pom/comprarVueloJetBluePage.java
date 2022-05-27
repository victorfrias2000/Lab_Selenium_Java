package com.lbselenium.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class comprarVueloJetBluePage {

    //elementos Web
    @FindBy(id = "jb-autocomplete-2-search")
            private WebElement paisSalida;
    @FindBy(id = "jb-autocomplete-1-search")
            private WebElement paisLLegada;
    @FindBy(id = "jb-date-picker-input-id-0")
            private WebElement fechaSalida;
    @FindBy(id = "jb-date-picker-input-id-1")
            private WebElement fechaFin;
    @FindBy(xpath = "//div[@class='db tc w-15-5-l center-m w-100-s-override ng-star-inserted']/button/span")
            private WebElement btnBuscarVuelos;

   //constructor de la clae
    public comprarVueloJetBluePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void datosVuelo(String inputPaiSalida,String inputPaisLlegada){
        paisSalida.sendKeys(inputPaiSalida);
        paisLLegada.sendKeys(inputPaisLlegada);
    }

    public void clic(){
        btnBuscarVuelos.click();
    }


}
