package com.humano.classruntest;

import com.lbselenium.pom.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCase_OpenChrome {

    private WebDriver driver;
    private final String urlJetBlue ="https://www.esky.com/flight-search?gclid=CjwKCAjw5c6LBhBdEiwAP9ejGxjJlaUC3Q3k2d17ryDOZTlNx2XbjYqCJmzkRa7xJwP9VSx-eMr_sBoCHmcQAvD_BwE";
    private final String url = "https://www.esky.com/flight-search?gclid=CjwKCAjwhuCKBhADEiwA1HegOSfOXttpcjrl7BIrSXGH9PfKr-ADCZQ580gClYD90UQ3R1quMMIs4BoC2M8QAvD_BwE";
    private final String urlHumanoSeguro = "https://www.jetblue.com/";
    private final String urlSolicitudEmepleReservas ="https://www.banreservas.com/se-parte-de-nosotros";
    private utilitycalss_selenium Utilitycalss_selenium;
    private reclamacionesOnlinePage Reclamaciones;
    private compraVoletoAereoPage voletoAereo;
    private comprarVueloJetBluePage ComprarVueloJetBluePage;
    private consultarDiectorioMedicoHumanoSeguroPage ConsultarDiectorioMedico;
    private solicitudEmpleoBancoReservasPage solicitarEmpleoBancoReservas;



    @BeforeTest
    public void setUp() {

        Utilitycalss_selenium = new utilitycalss_selenium(driver);
        driver = Utilitycalss_selenium.openChrome();
        Utilitycalss_selenium.openWebSite(urlSolicitudEmepleReservas);
        voletoAereo = new compraVoletoAereoPage(driver);
        ComprarVueloJetBluePage = new comprarVueloJetBluePage(driver);
        ConsultarDiectorioMedico = new consultarDiectorioMedicoHumanoSeguroPage(driver);
        solicitarEmpleoBancoReservas =new solicitudEmpleoBancoReservasPage(driver);


    }

    @Test(enabled = false)
    public void TestCaseAutorizacionesOline() {
        Reclamaciones = new reclamacionesOnlinePage(driver);
        Reclamaciones.IniciarSesiónreclamaciones();
    }

    @Test(enabled = false)
    public void comparaVoletoAerolinia() {

        voletoAereo.Searchflights("Las Americas (SDQ)", "Philadelphia Intl Airport (PHL)",
                "2021-11-10", "2021-12-07");
        voletoAereo.cliciBtnBusqudaVuelo();

    }

    @Test(enabled = false)
    public void compraVuelojetBlue(){


        }
    @Test(enabled = false)
    public void DirectorioMedico(){

       //ConsultarDiectorioMedico.cliclinkDirectorioMedico();
//        ConsultarDiectorioMedico.BusquedaDirectorio();
       // ConsultarDiectorioMedico.acceptPopup();

    }

    @Test(enabled = true)
    public void solicEmpleoBancoReservas() throws InterruptedException {
        solicitarEmpleoBancoReservas.accesoPortalSolicitudEmpleo();


    }


}
