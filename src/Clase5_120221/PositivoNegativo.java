package Clase5_120221;

import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if (num <= -1) {
            System.out.println("Negativo.");
        } else {
            System.out.println("Positivo.");
        }
    }

}
