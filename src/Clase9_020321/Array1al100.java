package Clase9_020321;

public class Array1al100 {

    public static void main(String[] args) {
        //Crea un array de números de 100 posiciones, 
        //que contendrá los números del 1 al 100. 
        //Obtén la suma de todos ellos y la media.
        int[] arr = new int[100]; //Creo el arreglo de 100 posiciones
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(arr[0]);
        System.out.println(arr[50]);
        System.out.println(arr[99]);
        double suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma = suma + arr[i];
        }
        System.out.println("Suma total: " + suma);
        double media = suma / arr.length;
        System.out.println("Media: " + media);
    }
    
}
