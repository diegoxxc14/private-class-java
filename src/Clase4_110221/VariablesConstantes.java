package Clase4_110221;

public class VariablesConstantes {

    public static void main(String[] args) {
        // --## VARIABLES
        //Deben ser únicas(No repetirse)
        //Siempre empezar por una letra (May o Min)
        //Solo el guion bajo _
        //Siempre deben empezar en minuscula (Buena práctica)
        int num = 213;        
        int num1 = 213;
        int num_1 = 213;
        //Java es sensible a las May y Min
        int Num = 23;
        int NUM = 43;        
        System.out.println(num);
        //El nombre de las variables es importante (tener sentido)
        String nombre = "Diego Cuenca";
        int edad = 26;
        char sexo = 'M';
        String dni = "1900787910";
        
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(sexo);
        
        String fechaNacimiento = "14-02-21"; //CamelCase
        String lugarNacimiento = "Loja";
        String apellidosNombres = "Cuenca Diego";
        int lugarDondeVives;
        
        String fecha_nacimiento;
        String lugar_donde_vives;
        
        num = 456;
        System.out.println(num);
        
        // --## CONSTANTES
        //No pueden cambiar su valor
        //Deben ir todo en mayúcula (Buena práctica)
        final double IVA = 0.12;
        final double PI = 3.131423122;
        System.out.println(PI);
    }

}
