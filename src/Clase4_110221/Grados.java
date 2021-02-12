package Clase4_110221;

import java.util.Scanner;

public class Grados {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Programa para pasar de grados centígrados a grados Kelvin y grados Reaumur.
        //Entradas
        System.out.println("Grados centigrados: ");
        double gCentigrados = leer.nextDouble();        

        //Proceso 
        //Grados Centigrados K =°C + 273.15 
        //Grados Reaumur °Re(°k - 273.15)*0.8 
        double gKelvin = gCentigrados + 273.15;
        double gReaumur = (gKelvin - 273.15) * 0.8;

        //Salida
        System.out.println("Grados Kelvin: " + gKelvin);
        System.out.println("Grados Reaumur: " + gReaumur);
    }

}
