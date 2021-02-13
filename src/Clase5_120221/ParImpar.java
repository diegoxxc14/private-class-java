package Clase5_120221;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar");
        }
    }
    
}
