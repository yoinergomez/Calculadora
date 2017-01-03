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
        int x = 2;
        int y = 3;
        int expResult = 5;
        int result = calc.sumar(x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of sumar anulación de signo method, of class Calculadora.
     */
    @Test
    public void testSumarAnulacionSigno() {
        System.out.println("sumar anulación de signo");
        int x = 6;
        int y = -2;
        int expResult = 4;
        int result = calc.sumar(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int x = 6;
        int y = 2;
        int expResult = 4;
        int result = calc.restar(x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of restar anulación de signo method, of class Calculadora.
     */
    @Test
    public void testRestarAnulacionSigno() {
        System.out.println("restar anulación de signo");
        int x = 6;
        int y = -2;
        int expResult = 8;
        int result = calc.restar(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int x = 4;
        int y = 6;
        int expResult = 24;
        int result = calc.multiplicar(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int x = 8;
        int y = 2;
        int expResult = 4;
        int result = calc.dividir(x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of dividir por cero method, of class Calculadora.
     */
    @Test (expected=ArithmeticException.class)
    public void testDividirPorCero() {
        System.out.println("dividir por cero");
        int x = 8;
        int y = 0;
        calc.dividir(x, y);
    }
    
    /**
     * Test of dividir numerador igual a cero method, of class Calculadora.
     */
    @Test
    public void testDividirNumeradorCero() {
        System.out.println("dividir numerador cero");
        int x = 0;
        int y = 2;
        int expResult = 0;
        int result = calc.dividir(x, y);
        assertEquals(expResult, result);
    }
}
