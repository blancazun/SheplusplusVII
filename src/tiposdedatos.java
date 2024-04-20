/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceptos;

/**
 *
 * @author gsepulve
 */
public class tiposdedatos {
    
     // Variable de instancia
    private int instanciaVariable;

    // Variable estática (o de clase)
    public static String claseVariable = "Hola";

    // Constructor
    public tiposdedatos(int instanciaVariable) {
        this.instanciaVariable = instanciaVariable;
    }

    // Método para mostrar el valor de la variable de instancia
    public void mostrarInstanciaVariable() {
        System.out.println("Variable de instancia: " + instanciaVariable);
    }

    // Método estático para mostrar el valor de la variable estática
    public static void mostrarClaseVariable() {
        System.out.println("Variable estática (de clase): " + claseVariable);
    }

    // Método para demostrar tipos de datos primitivos y objetos
    public void demostrarTiposDatos() {
        // Tipos de datos primitivos
        int entero = 10;
        double doble = 3.14;
        char caracter = 'A';
        boolean booleano = true;

        System.out.println("Tipo de dato primitivo - entero: " + entero);
        System.out.println("Tipo de dato primitivo - doble: " + doble);
        System.out.println("Tipo de dato primitivo - caracter: " + caracter);
        System.out.println("Tipo de dato primitivo - booleano: " + booleano);

        // Objetos (tipos de datos más complejos)
        String cadena = "Hola Mundo";
        Integer objetoEntero = new Integer(20);
        Double objetoDoble = new Double(5.5);

        System.out.println("Tipo de dato objeto - cadena: " + cadena);
        System.out.println("Tipo de dato objeto - entero (Integer): " + objetoEntero);
        System.out.println("Tipo de dato objeto - doble (Double): " + objetoDoble);
    }
}
