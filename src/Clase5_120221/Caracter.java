package Clase5_120221;

import java.util.Scanner;

public class Caracter {

    public static void main(String[] args) {
        char car1 = 35; //Toma el valor del código Ascii
        char car2 = '#';
        System.out.println(car1);
        System.out.println(car2);
        
        Scanner leer = new Scanner(System.in);
        String caracter = leer.next(); //Leer por teclado (String)
        char car = caracter.charAt(0);//Convertir el String en un char
        if (car >= 65 && car <= 90) {
            System.out.println("Mayúscula");
        } else {
            System.out.println("Minúscula");
        }
    }

}
