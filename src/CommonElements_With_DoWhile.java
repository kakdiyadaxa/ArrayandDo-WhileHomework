import java.util.Arrays;

public class CommonElements_With_DoWhile {
        public static void main(String[] args) {
            // Initialize the arrays
            String[] arr1 = {"Daxa", "Sanaya", "Akshar", "Pravin", "India"};
            String[] arr2 = {"England", "India", "Daxa", "London", "Pravin"};

            // Sort the arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Initialize a counter for the common elements
            int count = 0;

            // Initialize the (how many times)  for the two arrays
            int i = 0, j = 0;

            // Use a do-while loop to find the common elements
            do {
                // If the current elements are equal, increment the counter and print the element
                if (arr1[i].equals(arr2[j])) {
                    count++;
                    System.out.print(arr1[i] + " ");
                    i++;
                    j++;
                } else if (arr1[i].compareTo(arr2[j]) < 0) {
                    // If the current element in arr1 is less than the current element in arr2, move to the next element in arr1
                    i++;
                } else {
                    // If the current element in arr2 is less than the current element in arr1, move to the next element in arr2
                    j++;
                }
            } while (i < arr1.length && j < arr2.length);

            // If no common elements were found, print a message
            if (count == 0) {
                System.out.println("No common elements found.");
            }
        }
    }


