package Clase8_260221;

public class Arrays {

    public static void main(String[] args) {
        int edad = 28;
        double saldo = 3.12;
        String nombre = "Diego Cuenca";
        boolean estado = false;
        char car = 'a';
        
        //Tamaño del arreglo
        int[] a = new int[5];
        a[0] = 2;
        a[1] = 20;
        a[2] = 10;
        a[3] = 7;
        a[4] = 5;
        System.out.println(a.length);
        System.out.println(a[1]);
        System.out.println(a[3]);
        
        String[] b = {"Diego", "Paul", "Leodan" ,"Juan"};
        System.out.println(b.length);
        System.out.println(b[2]);
        
        double[] c = new double[3];
        c[0] = 3.2;
        c[1] = 5.4;
        c[2] = 7.3;
        System.out.println(c.length);
        System.out.println(c[2]);
        
        boolean[] d = {false, true, false, true, true, false};
        System.out.println(d.length);
        System.out.println(d[0]);
    }
    
}
