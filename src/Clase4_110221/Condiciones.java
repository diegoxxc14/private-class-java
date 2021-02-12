package Clase4_110221;

public class Condiciones {

    public static void main(String[] args) {
        //Identicar el mayor de 2 números
        int num1 = 301;
        int num2 = 300;

        if (num1 > num2) {//SI
            System.out.println("El mayor es: " + num1);
        } else { //NO 
            System.out.println("El mayor es: " + num2);
        }

        if (num1 < num2) {//SI
            System.out.println("El mayor es: " + num2);
        } else { //NO 
            System.out.println("El mayor es: " + num1);
        }
    }

}
