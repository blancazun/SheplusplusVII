/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceptos;

/**
 *
 * @author gsepulve
 */
public class IfElseExample {
    
      // Método para verificar si una persona es mayor de edad
    public void verificarEdad(int edad) {
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }
    }

    // Método para verificar si un estudiante ha aprobado
    public void verificarAprobacion(boolean esEstudiante, double promedio) {
        if (esEstudiante && promedio >= 70.0) {
            System.out.println("El estudiante ha aprobado.");
        } else {
            System.out.println("El estudiante no ha aprobado.");
        }
    }

    // Método para determinar el signo de un número
    public void determinarSigno(int numero) {
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
    
}
