package Clase3_100221;

import java.util.Scanner;

public class VolumenEsfera {

    public static void main(String[] args) {
        //Entrada
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        double radio = leer.nextDouble();
        
        //Proceso
        double vol = (4 * Math.PI * Math.pow(radio, 3))/3; //Fórmula: V=3/4 * PI * r^3
        
        //Salida
        System.out.println("Volumen: " + vol);
    }
    
}
