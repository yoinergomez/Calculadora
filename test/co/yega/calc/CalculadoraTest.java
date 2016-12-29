/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.yega.calc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Realiza las pruebas pertinentes para la clase Calculadora.java
 * @version 1.0.0
 * @author Yoiner Esteban Gómez Ayala - yoiner.gomez22@gmail.com
 */
public class CalculadoraTest {
    
    private Calculadora calc;
    
    public CalculadoraTest() {
        System.out.println("Constructor");
        calc = new Calculadora();
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = calc.sumar(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = calc.restar(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = calc.multiplicar(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = calc.dividir(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
}
