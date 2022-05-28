package com.lbselenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class compraVoletoAereoPage extends utilitycalss_selenium {

    @FindBy(id = "departureRoundtrip0")
    private WebElement inputCitysDesde;

    @FindBy(id = "arrivalRoundtrip0")
    private WebElement inpuCityHasta;

    @FindBy(id = "departureDateRoundtrip0")
    private WebElement inputFechaDesde;

    @FindBy(id = "departureDateRoundtrip1")
    private WebElement inputFechaHasta;

    @FindBy(xpath = "//button[@class='btn transaction qsf-search']")
    private WebElement btnSearchFlight;


    public compraVoletoAereoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void Searchflights(String cityFrom, String cityArrivert, String fechaDesde, String fechaHasta) {

        inputCitysDesde.sendKeys(cityFrom);
        inpuCityHasta.sendKeys(cityArrivert);
        inputFechaDesde.sendKeys(fechaDesde);
        inputFechaHasta.sendKeys(fechaHasta);

    }

    public void cliciBtnBusqudaVuelo() {
        btnSearchFlight.click();
    }
//esteo codigo es para prueba valcantara

}

