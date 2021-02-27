package Clase8_260221;

public class RecorrerArreglos {

    public static void main(String[] args) {
        double[] notas = {8.7, 10, 9.9, 6, 8.9, 10, 9.8, 9, 10, 8.7, 9, 6.7};
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        String[] nombres = {"Diego", "Paul", "Cuenca", "Quezada"};
        for (int i = 0; i <= nombres.length - 1; i++) {
            System.out.println(nombres[i]);
        }
        
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println(nombres[i]);
        }
    }

}
