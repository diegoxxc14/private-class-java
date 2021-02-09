package Clase2_090221;

import java.util.Scanner;

public class Pitagoras {

    public static void main(String[] args) {
        /*
        Programa lea la longitud de los catetos de un triángulo rectángulo y calcule 
        la longitud de la hipotenusa según el teorema de Pitágoras. 
         */
        //Entradas
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa cateto 1: ");
        double cateto1 = leer.nextDouble(); //Valor del cateto a
        System.out.println("Ingresa cateto 2: ");
        double cateto2 = leer.nextDouble(); //Valor del cateto b

        //Proceso
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        //Salida
        System.out.println("Hipotenusa: " + hipotenusa);
    }

}
