package ejercicios;

import java.util.Scanner;

public class LeerTeclado {

    public static void main(String[] args) {
        //Declarar el Scanner
        Scanner leer = new Scanner(System.in);
        //Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
        
        System.out.println("* Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("* Ingrese su edad: ");
        int edad = leer.nextInt(); //Lee por teclado
        
        if (edad >= 18) { //Cuando se cumple la condición
            //Cuando es verdadero
            System.out.println(nombre + " es mayor de edad.");
        } else {
            //Cuando no es Verdadero o cuando es Falso
            System.out.println(nombre + " es menor de edad");
        }
    }
    
}
