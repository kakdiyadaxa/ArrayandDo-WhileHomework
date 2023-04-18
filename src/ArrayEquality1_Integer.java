import java.util.Arrays;

public class ArrayEquality1_Integer {
    //Java Arrays class provides the equals() method to compare two arrays
    public static void main(String[] args) {
        //defining array to compare
        int[] array1 = new int[] {'a','b','c','d'};
        int[] array2 = new int[] {'a','b','e','d'};

        //comparing two arrays using equals() method
        if (Arrays.equals(array1,array2)){
            System.out.println("Arrays are equal.");
        }
        else {
            System.out.println("Arrays are not equal.");
        }
    }
}
