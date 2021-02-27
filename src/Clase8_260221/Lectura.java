package Clase8_260221;

import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] animales = new String[5];
        
        //Llenando el arreglo
        for (int i = 0; i < animales.length; i++) {
            System.out.println("Ingrese valor[" + i + "]: ");
            animales[i] = leer.nextLine();
        }

        //Leyendo el arreglo
        System.out.println("Todos los animales: ");
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i]);
        }
    }

}
