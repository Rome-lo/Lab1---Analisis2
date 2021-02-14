/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laboratorio.test;

import com.laboratorio.beans.Operaciones;
import java.util.HashSet;
import java.util.Set;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

/**
 *
 * @author romeo
 */
public class TestClassOne {
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
}
