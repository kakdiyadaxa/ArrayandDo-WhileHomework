public class Divided_by3and5_100 {
    //main method
    public static void main(String[] args) {
            int i = 1;
            System.out.println("Numbers divisible by 3:");
            // using do-while loop to print numbers divisible by 3
            do {
                if (i % 3 == 0) {
                    System.out.print(i + " "); // print the number if it's divisible by 3
                }
                i++; // increment the loop counter
            } while (i <= 100); // continue until the loop counter reaches 100

            i = 1; // reset the loop counter to 1
            System.out.println("\nNumbers divisible by 5:");
            // using do-while loop to print numbers divisible by 5
            do {
                if (i % 5 == 0) {
                    System.out.print(i + " "); // print the number if it's divisible by 5
                }
                i++; // increment the loop counter
            } while (i <= 100); // continue until the loop counter reaches 100
        }
    }


