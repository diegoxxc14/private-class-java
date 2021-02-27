package Clase6_170221;

public class CiclosRepetitivos {

    public static void main(String[] args) {
        //While
        int cont = 1;
        while (cont <= 10) {            
            System.out.println(cont);
            //cont = cont + 1;
            //cont += 1;
            cont++;//De 1 en 1
        }
        
        //Do while
        cont = 1;
        do {            
            System.out.println(cont);
            cont++;
        } while (cont <= 10);
        
        //For
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
