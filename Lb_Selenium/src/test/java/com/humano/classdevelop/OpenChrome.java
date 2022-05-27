package com.humano.classdevelop;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenChrome {

    //  public String PaginaWeb = "https://www.google.com/?hl=es";
    private WebDriver driver;

    public void LoadChrome(String PaginaWeb) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(PaginaWeb);
    }


}
