
package Desafío;

import java.util.Random;
import java.util.Scanner;

public class GuessGame_Sol{
    private int numeroAdivinar;
    private int[] suposiciones;
    private int intentos;
    
    public GuessGame_Sol(){
        Random rand = new Random();
        numeroAdivinar = rand.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        suposiciones = new int[10]; // Historial de 10 suposiciones
        intentos = 0;
    }
    
    public void jugar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego de adivinanza!");
        System.out.println("Adivina el número entre 1 y 100.");

        while (true) {
            System.out.print("Introduce tu suposición: ");
            int suposicion = sc.nextInt();

            suposiciones[intentos] = suposicion;
            intentos++;

            if (suposicion < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor");
            } else if (suposicion > numeroAdivinar) {
                System.out.println("El número a adivinar es menor");
            } else {
                System.out.println("Has adivinado el número en " + intentos + " intentos.");
                break;
            }

            if (intentos == 10) {
                System.out.println("Has agotado tus 10 intentos. El número era: " + numeroAdivinar);
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        GuessGame_Sol juego = new GuessGame_Sol();
        juego.jugar();
    }
}
