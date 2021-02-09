package Clase2_090221;

import java.util.Scanner;

public class DobleTriple {

    public static void main(String[] args) {
        //Programa Java que lee un número entero por teclado y obtiene y 
        //muestra por pantalla el doble y el triple de ese número.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int num = leer.nextInt(); //Leer un entero por teclado
        
        int doble = num * 2; //Obtener el doble
        int triple = num * 3; //Obtener el triple
        
        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);
    }
    
}
