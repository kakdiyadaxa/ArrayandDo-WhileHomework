import java.util.Arrays;
import java.util.HashSet;

public class CommonElementsNo2 {
    //main method
    public static void main(String[] args) {
        //Initializing the two integer arrays to compare
        int[] array1 = {1, 2, 3, 4, 8, 6, 7};
        int[] array2 = {1, 5, 7, 5, 10, 6, 8};

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        //length is property of array
        //printing array using for-each loop
        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {

                    //print the common elements
                    System.out.println("Common Element between two array: " + (array1[i]));

                }
            }
        }



    }
}