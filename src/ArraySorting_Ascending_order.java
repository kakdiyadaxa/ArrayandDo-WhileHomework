import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting_Ascending_order {
    public static void main(String[] args) {

        //defining an array of integer type
        int [] array = new int [] {100, 23, 5, -20, 12, 22, 67, 64};

        //invoking sort() method of the Arrays class
        Arrays.sort(array);

        //Displaying elements of String
        System.out.println("Elements of array sorted in ascending order: ");

        //prints array using the for loop
        for (int i = 0; i < array.length; i++)
        {
            //prints result
            System.out.println(array[i]);
        }
    }
    }


