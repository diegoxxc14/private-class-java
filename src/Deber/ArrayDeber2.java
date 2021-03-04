package Deber;

import java.util.Scanner;

public class ArrayDeber2 {

    public static void main(String[] args) {
        /*
        Crea un array de números de un tamaño pasado por teclado, 
        el array contendrá números aleatorios, 
        por último nos indica cual es el mayor de todos.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Tamaño arreglo: ");
        int tam = leer.nextInt();
        int[] arr = new int[tam];
        for (int i = 0; i < tam; i++) {
            arr[i] = (int)(Math.random() * 100);//Generar un número aleatorio entre 1 y 100
        }
        
        for (int i = 0; i < tam; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
