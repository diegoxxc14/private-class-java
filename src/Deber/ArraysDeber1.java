package Deber;

public class ArraysDeber1 {

    public static void main(String[] args) {
        /*
        Dado un array de números de 5 posiciones con los siguiente 
        valores {1,2,3,4,5}, guardar los valores de este array en 
        otro array distinto pero con los valores invertidos, es decir, 
        que el segundo array debera tener los valores {5,4,3,2,1}.
        */
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        
        int j = arr2.length - 1; // j índice del arr2 = 4
        for (int i = 0; i < arr1.length; i++) {// i índice del arr1 = 0
            arr2[j] = arr1[i];
            j--;   
        }
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
    
}
