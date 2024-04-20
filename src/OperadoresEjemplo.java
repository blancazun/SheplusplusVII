/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceptos;

/**
 *
 * @author gsepulve
 */
public class OperadoresEjemplo {
    
    // Método para ejemplificar operadores aritméticos
    public void ejemplificarOperadoresAritmeticos() {
        int a = 10;
        int b = 20;

        // Suma
        int suma = a + b;
        System.out.println("Suma de " + a + " y " + b + " es: " + suma);

        // Resta
        int resta = b - a;
        System.out.println("Resta de " + b + " y " + a + " es: " + resta);

        // Multiplicación
        int multiplicacion = a * b;
        System.out.println("Multiplicación de " + a + " y " + b + " es: " + multiplicacion);

        // División (entera y decimal)
        double division = (double) b / a; // Conversión a double para obtener resultado decimal
        System.out.println("División de " + b + " entre " + a + " es: " + division);

        // Módulo (residuo de la división)
        int modulo = b % a;
        System.out.println("Módulo de " + b + " entre " + a + " es: " + modulo);
    }

    // Método para ejemplificar operadores lógicos
    public void ejemplificarOperadoresLogicos() {
        boolean x = true;
        boolean y = false;

        // Operador AND (&&)
        boolean resultadoAND = x && y;
        System.out.println("Resultado de x && y: " + resultadoAND);

        // Operador OR (||)
        boolean resultadoOR = x || y;
        System.out.println("Resultado de x || y: " + resultadoOR);

        // Operador NOT (!)
        boolean resultadoNOT = !x;
        System.out.println("Resultado de !x: " + resultadoNOT);
    }

    // Método para ejemplificar operadores de comparación
    public void ejemplificarOperadoresComparacion() {
        int num1 = 10;
        int num2 = 20;

        // Imprime los valores de num1 y num2 
        System.out.println("num1 es igual a " +num1);
        System.out.println("num2 es igual a " +num2);
        
        // Operador de comparación (==)
        boolean igual = (num1 == num2);
        System.out.println("¿num1 es igual a num2? " + igual);

        // Operador de comparación (!=)
        boolean distinto = (num1 != num2);
        System.out.println("¿num1 es distinto de num2? " + distinto);

        // Operador relacional (<)
        boolean menorQue = (num1 < num2);
        System.out.println("¿num1 es menor que num2? " + menorQue);

        // Operador relacional (>)
        boolean mayorQue = (num1 > num2);
        System.out.println("¿num1 es mayor que num2? " + mayorQue);

        // Operador relacional (<=)
        boolean menorIgualQue = (num1 <= num2);
        System.out.println("¿num1 es menor o igual que num2? " + menorIgualQue);

        // Operador relacional (>=)
        boolean mayorIgualQue = (num1 >= num2);
        System.out.println("¿num1 es mayor o igual que num2? " + mayorIgualQue);
    }

    
}
