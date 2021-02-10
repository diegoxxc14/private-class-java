package Clase3_100221;

import java.util.Scanner;

public class ConvertirVelocidad {

    public static void main(String[] args) {
        //Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
        Scanner leer = new Scanner(System.in);
        System.out.println("Velocidad (km/h): ");
        double v = leer.nextDouble();
        
        double res = (v * 1000) / 3600;
        
        System.out.println("(m/s): " + res);
    }
    
}
