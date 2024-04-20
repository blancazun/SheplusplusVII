/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceptos;

/**
 *
 * @author gsepulve
 */
public class tiposdevariables {
    
     
    private int edad;
    private double altura;
    private boolean esEstudiante;
    private String nombre;

    // Constructor que recibe los parámetros
        public tiposdevariables(int edad, double altura, boolean esEstudiante, String nombre) {
        this.edad = edad;
        this.altura = altura;
        this.esEstudiante = esEstudiante;
        this.nombre = nombre;
        }
        
        public void mostrarInformacion() {
        System.out.println(nombre + " tiene " + edad + " años y mide " + altura + " metros.");
        if (esEstudiante) {
            System.out.println(nombre + " es estudiante.");
        } else {
            System.out.println(nombre + " no es estudiante.");
        }
        }

    public static void main(String[] args) {
        //Instanciar objeto 
        
        //Asignar valores a sus atributos
        
        //Utilizar sus métodos
    }

        
    
    
}
