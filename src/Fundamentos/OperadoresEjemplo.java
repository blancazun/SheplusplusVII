/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fundamentos;

/**
 *
 * @author bzuni
 */
public class OperadoresEjemplo {
    
    // Método para ejemplificar operadores aritméticos 
    public void ejemplificaarOperadoresAritmeticos(){
        int a = 10;
        int b = 20; 
        
        //Suma 
        int suma = a + b; 
       System.out.println("Suma: "+suma);
       
       //Multiplicacion 
       int multiplicacion = a * b; 
        System.out.println("Multiplicacion: "+multiplicacion);
    }
    
    
    //Método para ejemplificiar operadores de comparacion 
    public void ejemplificarOperadoresComparacion(){
    int num1= 3; 
    int num2 = 17; 
    
    // Comparaciones
    boolean igual = (num1 == num2);
    System.out.println("num1 es igual a num2? "+igual);
    } 
    
    public static void main(String[] args) {
        //crear un objeto nuevo 
        
        OperadoresEjemplo operadores = new OperadoresEjemplo();
        operadores.ejemplificaarOperadoresAritmeticos();
        operadores.ejemplificarOperadoresComparacion();
    }
    
}