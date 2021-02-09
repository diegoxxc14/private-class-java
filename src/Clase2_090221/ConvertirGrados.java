package Clase2_090221;

import java.util.Scanner;

public class ConvertirGrados {

    public static void main(String[] args) {
        //Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
        //La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
        Scanner leer = new Scanner(System.in);
        System.out.println("Grados centígrados: ");
        double gCentigrados = leer.nextDouble();
        
        //double gFahrenheit = 32 + (9 * gCentigrados / 5);
        double gFahrenheit = gCentigrados * 1.8 + 32;
        
        System.out.println("Grados Fahrenheit: " + gFahrenheit);
    }

}
