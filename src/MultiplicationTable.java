public class MultiplicationTable {
        public static void main(String[] args) {
            int i = 1, j;
            // using do-while loop to print multiplication table from 1 to 3
            do {
                j = 1;
                // using nested do-while loop to print the table for each number
                do {
                    System.out.print(i * j + " "); // print the product of i and j
                    j++;
                } while (j <= 3); // continue until the inner loop counter reaches 3
                System.out.println(); // move to the next line
                i++;
            } while (i <= 3); // continue until the outer loop counter reaches 3
        }
    }


