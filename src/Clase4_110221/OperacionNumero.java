package Clase4_110221;

import java.util.Scanner;

public class OperacionNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Declara dos variables numéricas con el valor que desees se muestre y lea por teclado la suma la resta la división la multiplicacion y el modulo
        //Entrada.
        System.out.println("ingresa un numero: ");
        double numero = leer.nextDouble();
        
        System.out.println("le sumo: ");
        double numSum = leer.nextDouble();
        
        System.out.println("le resto: ");
        double numRes = leer.nextDouble();
        
        System.out.println("le divido:");
        double numDiv = leer.nextDouble();
        
        System.out.println("le multiplico: ");
        double numMul = leer.nextDouble();
        
        System.out.println("el modulo es: ");
        double numMod = leer.nextDouble();

        //Proceso
        double resultado = ((((numero * numSum) - numRes) / numDiv) * numMul) % numMod;
        
        //double resultado = nota1 + nota2 - nota3/ nota4 * nota5 % nota6;
        
        //Salida
        System.out.println("el resultado total es: " + resultado);
    }

}
