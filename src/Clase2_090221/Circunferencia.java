package Clase2_090221;

import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
       /*
        Programa que lee por teclado el valor del radio de una circunferencia y calcula 
        y muestra por pantalla la longitud y el área de la circunferencia. 
        Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2  
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        double radio = leer.nextDouble();
       
        double lon = 2 * Math.PI * radio; //Longitud o perímetro
        double area = Math.PI * Math.pow(radio, 2);//Área
        
        System.out.println("Longitud: " + lon);
        System.out.println("Área: " + area);
    }
    
}
