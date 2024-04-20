/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceptos;

/**
 *
 * @author gsepulve
 */
public class ejemplowhile {
    
     // Método para contar hasta cierto número usando un bucle while
    public void contarHastausandowhile(int limite) {
        int contador = 1;

        System.out.println("Contando hasta " + limite + " usando un bucle while:");
        while (contador <= limite) {
            System.out.println(contador);
            contador++;
        }
    }

    // Método para sumar números hasta que la suma supere un límite usando un bucle while
    public void sumarHastaLimite(int limite) {
        int suma = 0;
        int numero = 1;

        System.out.println("\nSumando números hasta que la suma supere " + limite + " usando un bucle while:");
        while (suma <= limite) {
            suma += numero;
            System.out.println("Suma parcial: " + suma);
            numero++;
        }
    } 

}
