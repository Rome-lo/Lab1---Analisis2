/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laboratorio.beans;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
//import org.testng.annotations.Test;

/**
 *
 * @author romeo
 */
@Named(value = "operaciones")
@ViewScoped
public class Operaciones implements Serializable{

    private Double dato1;
    private Double dato2;
    private Double res;
    
    public Operaciones() {
    }

    public Double getDato1() {
        return dato1;
    }

    public void setDato1(Double dato1) {
        this.dato1 = dato1;
    }

    public Double getDato2() {
        return dato2;
    }

    public void setDato2(Double dato2) {
        this.dato2 = dato2;
    }

    public Double getRes() {
        return res;
    }

    public void setRes(Double res) {
        this.res = res;
    }
    
    
    //prueba lab 3
    public void suma(){
        //prueba lab part 2
        //prueba lab part 3
        this.res = this.dato1 + this.dato2;
    }
    public void resta(){
        this.res = this.dato1 - this.dato2;
    }
    public void multiplicacion(){
        this.res = this.dato1 * this.dato2;
    }
    public void division(){
        this.res = this.dato1 / this.dato2;
    }
    
}
