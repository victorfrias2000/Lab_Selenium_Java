package com.lbselenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class solicitudEmpleoBancoReservasPage {

    //WebElements declarados
    @FindBy(xpath = "//a[@class='btn-more btn btn-transparent orange']")
    private WebElement btnParteNosotros;
    @FindBy(id = "nombre")
    private WebElement nombre;
    @FindBy(id = "apellidos")
    private WebElement apellido;
    @FindBy(id = "fecha_nac")
    private WebElement fecha_nac;
    @FindBy(id = "sexo")
    private WebElement dropSexo;
    @FindBy(id = "id_tipo_dni")
    private WebElement documentoIdentificativo;
    @FindBy(id = "dni")
    private WebElement identificativoPersonal;
    @FindBy(id = "id_estado_civil")
    private WebElement estadoCivil;
    @FindBy(id = "email_part")
    private WebElement inputEmail;
    @FindBy(id = "telefono_part")
    private WebElement telefResidencial;
    @FindBy(id = "movil_part")
    private WebElement movil;
    @FindBy(id = "direccion")
    private WebElement direccion;
    @FindBy(id = "poblacion")
    private WebElement Poblacion;
    @FindBy(id = "id_pais")
    private WebElement inputPais;
    @FindBy(id = "observaciones")
    private WebElement txtObservaciones;
    @FindBy(id = "id_nacionalidad")
    private WebElement Nacionalidad;
    @FindBy(id = "id_provincia")
    private WebElement provincia_id;


    //declaricon variabes
    private final String Nombre = "Victor " + " Manuel";
    private final String Apellido = "Alcantara " + " Frias ";
    private final String FechaNac = "02/02/1981";
    private final String Sexo = "M";
    private final String identificativo = "006";
    private final String identificacionPersonal = "00115530967";
    private final String estado_civil = "002";
    private final String correoElectronico = "victorfrias2000@hotmail.com";
    private final String residencialTelefono = "8093330909";
    private final String Movil = "8293339898";
    private final String Direccion = "las palmas herreras santo domingo norte";
    private final String ciudad = "santo domingo este";
    private final String InputPais = "68";
    private final String txtNotas ="ningunas";
    private final String nacionalidad ="115";
    private final String provincia = "877";

    //declaracion de variables
    private final WebDriver driver;

    //constructor de la clase
    public solicitudEmpleoBancoReservasPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void accesoPortalSolicitudEmpleo() throws InterruptedException {

        btnParteNosotros.click();
        Thread.sleep(5000);
        //para moverme de una pestana a otra en el navegador chrome
        ArrayList<String> pestana = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(pestana.get(1));
        nombre.sendKeys(Nombre);
        apellido.sendKeys(Apellido);
        fecha_nac.sendKeys(FechaNac);
        selectSexo(dropSexo);
        selectDocumentIdentificativo(documentoIdentificativo);
        identificativoPersonal.sendKeys(identificacionPersonal);
        selectEstadoCivil(estadoCivil);
        inputEmail.sendKeys(correoElectronico);
        telefResidencial.sendKeys(residencialTelefono);
        movil.sendKeys(Movil);
        direccion.sendKeys(Direccion);
        Poblacion.sendKeys(ciudad);
        selectPais(inputPais);
        SelectIdnacinalidad(Nacionalidad);
        SelectIdprovincia(provincia_id);
        txtObservaciones.sendKeys(txtNotas);

    }

    public void selectSexo(WebElement locator) {
        Select selct = new Select(locator);
        selct.selectByValue(Sexo);
    }

    public void selectDocumentIdentificativo(WebElement locator) {
        Select selct = new Select(locator);
        selct.selectByValue(identificativo);
    }

    public void selectEstadoCivil(WebElement locator) {
        Select selct = new Select(locator);
        selct.selectByValue(estado_civil);
    }

    public void selectPais(WebElement locator) {
        Select selct = new Select(locator);
        selct.selectByValue(InputPais);
    }

    public void SelectIdnacinalidad(WebElement locator) {
        Select selct = new Select(locator);
        selct.selectByValue(nacionalidad);
    }

    public void SelectIdprovincia(WebElement locator) {
        Select selct = new Select(locator);
        selct.selectByValue(provincia);
    }


}
