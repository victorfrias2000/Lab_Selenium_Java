package com.lbselenium.pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class utilitycalss_selenium {

    private WebDriver driver;

    //cosntructor de la clase utilitycalss_selenium
    public utilitycalss_selenium(WebDriver driver) {

        this.driver = driver;
    }

    //me permite crear una instancia del navegador chrome
    public WebDriver openChrome() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
    //abre la pangina donde se ejecutara la prueba
    public void openWebSite(String Url){
        driver.get(Url);
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public void type(String inputText,By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }









}
