package co.yega.calc;

/**
 * Puede realizar las operaciones de suma, resta, multiplicación y división
 * donde los operandos son números enteros
 * @version 1.0.0
 * @author Yoiner Esteban Gómez Ayala - yoiner.gomez22@gmail.com
 */
public class Calculadora {

    public int sumar(int x, int y){
        return x+y;
    }
    
    public int restar(int x, int y){
        return x-y;
    }
    
    public int multiplicar(int x, int y){
        return x*y;
    }
    
    public int dividir(int x, int y){
        if (y==0) {
            throw new ArithmeticException("División por cero");
        }
        return x/y;
    }
    
}
