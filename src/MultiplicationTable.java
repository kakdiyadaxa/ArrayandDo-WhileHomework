public class MultiplicationTable {
      public static void main(String[] args) {
          //Displaying presentation as elements of String
          System.out.println("Below is the Multiplication table prints as per requirement: ");
            int i = 1, j;
            // using do-while loop to print multiplication table from 1 to 3
            do {
                j = 1;
                // using nested do-while loop to print the table for each number
                do {
                    System.out.print(i * j + "\t"); // print the product of i and j and tab character
                   j++;
                  //  System.out.println();
                } while (j <= 3); // continue until the inner loop counter reaches 3
                System.out.println(); // move to the next line
                i++;
                System.out.println();
            } while (i <= 2); // continue until the outer loop counter reaches 3
          int i1 = 3;
          do {
              System.out.print(i1 + " ");//print method for in same line
              i1 += 3;
          }while (i1 <= 9);

        }
    }


