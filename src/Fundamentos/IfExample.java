
package Fundamentos;

import java.util.Scanner;


public class IfExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el valor de a:");
        int a = sc.nextInt();
        
        System.out.println("Introduce el valor de b:");
        int b = sc.nextInt();
        
        if(a!=b){
            System.out.println("Son diferentes");
        }else if(true){
            System.out.println("Son iguales");
        }
        
    }
}
