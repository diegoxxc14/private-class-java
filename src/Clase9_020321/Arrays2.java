package Clase9_020321;

import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args) {
        /*
        1) Crea un array de 10 posiciones de números con valores 
        pedidos por teclado. Muestra por consola el indice y el valor al que corresponde. 
        Haz dos métodos, uno para rellenar valores y otro para mostrar.
        */
        Scanner leer = new Scanner(System.in);
        int[] lista = new int[10];// Tengo mi arreglo vacío con 10 posiciones  
        //Rellenar el arreglo
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Valor["+i+"]:");
            lista[i] = leer.nextInt();
        }
        System.out.println("---------------");
        //Presentar los valores del arreglo
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Pos: " + i);
            System.out.println("Val: " + lista[i]);
        }
    }
    
}
