package Clase9_020321;

import java.util.Scanner;

public class ArrayString {

    public static void main(String[] args) {
        // Pide al usuario por teclado una frase y pasa 
        //sus caracteres a un array de caracteres. 
        //Puedes hacer con o sin métodos de String.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        int tamFrase = frase.length(); //Tamaño o longitud de la frase

        char[] arrCar = new char[tamFrase];//Array de caracteres
        
        //Pasar los caracteres de la frase al arreglo
        for (int i = 0; i < arrCar.length; i++) {
            arrCar[i] = frase.charAt(i);
        }
        System.out.println("------------------------");
        //Recorrer el arreglo
        for (int i = 0; i < arrCar.length; i++) {
            System.out.println("Pos: " + i);
            System.out.println("Valor: " + arrCar[i]);
        }
    }
    
}
