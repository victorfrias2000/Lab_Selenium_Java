package com.lbselenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class reclamacionesOnlinePage  extends utilitycalss_selenium{

   private final By inputUsername = By.name("username");
   private final By inputPassword = By.name("password");
   private final By inputBtnIniciarSesión = By.name("Submit");
   private final By inputBtnSolictarAutorizacion = By.xpath("//input[@class='btn-humano-primary']");

    private final String Username ="234";
    private final String Password ="3234";

    public reclamacionesOnlinePage(WebDriver driver) {

        super(driver);
    }

    public void IniciarSesiónreclamaciones(){

        type(Username,inputUsername);
        type(Password,inputPassword);
        click(inputBtnIniciarSesión);
        click(inputBtnSolictarAutorizacion);
    }





}
