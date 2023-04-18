import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementDoWhile {
    //main method
    public static void main(String[] args) {
        //Initialize an array with some elements
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        //specify the element to remove
        int elementToRemove = 4;

        //keep track of the current index in the new array
        int index = 0;
        //Create a new array that is one element is smaller than the original array
        int[] newNumbers = new int[numbers.length -1];

        //using do-while
        do {
            //if this element is not the one to remove
            if (numbers[index] != elementToRemove ){
                //copy it to new array
                newNumbers[index] = numbers[index];
                //move to the next index in the new array
                index++;
            }
            else {
                //If the element is the one to remove, then move all numbers one index to the left
                for (int i = index + 1; i < numbers.length; i++) {
                    newNumbers[index] = numbers[i];
                    index++;
                }
            }
        } while (index < newNumbers.length);

        //Print the new array to verify that the element has been removed
        System.out.println(Arrays.toString(newNumbers));

    }
}