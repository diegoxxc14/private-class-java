package Deber;

public class Ciclos {

    public static void main(String[] args) {
        //while
        int i = 100;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        //do while
        i = 100;
        do {
            System.out.println(i);
            i -= 1;
        } while (i >= 1);

        //for
        for (int j = 100; j >= 1; j--) {
            System.out.println(j);
        }
    }
}
