/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laboratorio.test;

import com.laboratorio.beans.Operaciones;
import java.util.HashSet;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

/**
 *
 * @author romeo
 */
public class TestClassOne {
    WebDriver driver1, driver2, driver3;
    WebDriverWait wait;
    
    public void TestClassOne(){
        
    }
    @Test
    public void TestSuma(){
        System.out.println("Ejecutando Test suma()");
        Operaciones op = new Operaciones();
        op.setDato1(Double.parseDouble("10"));
        op.setDato2(Double.parseDouble("15"));
        op.suma();
        Double resultado = op.getRes();
        assertEquals(resultado,Double.parseDouble("25"), 0.001,"Error en test Suma()");
    }
    @Test
    public void TestResta(){
        System.out.println("Ejecutando Test resta()");
        Operaciones op = new Operaciones();
        op.setDato1(Double.parseDouble("15"));
        op.setDato2(Double.parseDouble("10"));
        op.resta();
        Double resultado = op.getRes();
        assertEquals(resultado,Double.parseDouble("5"), 0.001,"Error en test Resta()");
    }
    @Test
    public void TestMulti(){
        System.out.println("Ejecutando Test multiplicacion()");
        Operaciones op = new Operaciones();
        op.setDato1(Double.parseDouble("15"));
        op.setDato2(Double.parseDouble("10"));
        op.multiplicacion();
        Double resultado = op.getRes();
        assertEquals(resultado,Double.parseDouble("150"), 0.001,"Error en test Multiplicacion()");
    }
    @Test
    public void TestDiv(){
        System.out.println("Ejecutando Test division()");
        Operaciones op = new Operaciones();
        op.setDato1(Double.parseDouble("20"));
        op.setDato2(Double.parseDouble("2"));
        op.division();
        Double resultado = op.getRes();
        assertEquals(resultado,Double.parseDouble("10"), 0.001,"Error en test Division()");
    }

    
    public void prueba1(){
        try {    

            
            System.out.println("Test en Firefox");
            System.setProperty("webdriver.gecko.driver", "/home/romeo/NetBeansProjects/WEBDRIVERS/geckodriver");
            driver1 = new FirefoxDriver();
            driver1.get("http://localhost:8080/labo1_ADS2/");
            System.out.println("################### " + driver1.getTitle() + " ##############################");
            WebElement dato1_A = driver1.findElement(By.id("frm:dato1"));
            dato1_A.sendKeys("10");
            WebElement dato2_A = driver1.findElement(By.id("frm:dato2"));
            dato2_A.sendKeys("20");
            WebElement btn_A = driver1.findElement(By.id("frm:suma"));
            btn_A.click();

            driver1.quit();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void prueba2(){
        try {    

            
            System.out.println("Test en Chrome");
            System.setProperty("webdriver.chrome.driver", "/home/romeo/NetBeansProjects/maven_selenium-master/resources/chromedriver");
            driver2 = new ChromeDriver();         
            driver2.get("http://localhost:8080/labo1_ADS2/");
            System.out.println("################### " + driver2.getTitle() + " ##############################");
            WebElement dato1_B = driver2.findElement(By.id("frm:dato1"));
            dato1_B.sendKeys("10");
            WebElement dato2_B = driver2.findElement(By.id("frm:dato2"));
            dato2_B.sendKeys("20");
            WebElement btn_B = driver2.findElement(By.id("frm:suma"));
            btn_B.click();

            driver2.quit();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    //@test
    //prueba para build con jenkins
    public void prueba3(){
        try {    
            System.out.println("Test en Opera");
            System.setProperty("webdriver.opera.driver","/home/romeo/NetBeansProjects/WEBDRIVERS/operadriver");
            driver3 = new OperaDriver();        
            driver3.get("http://localhost:8080/labo1_ADS2/");
            System.out.println("################### " + driver3.getTitle() + " ##############################");
            WebElement dato1_C = driver3.findElement(By.id("frm:dato1"));
            dato1_C.sendKeys("10");
            WebElement dato2_C = driver3.findElement(By.id("frm:dato2"));
            dato2_C.sendKeys("20");
            WebElement btn_C = driver3.findElement(By.id("frm:suma"));
            btn_C.click();
            driver3.quit();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    @AfterClass
    public void tearDownClass() throws Exception {

    }
    
    
    
}
