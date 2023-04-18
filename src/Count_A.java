import java.util.Scanner;

public class Count_A {
    //main method
    public static void main(String[] args) {
        //import scanner class
        Scanner scanner = new Scanner(System.in);

        //get the string input from user
        String input;
        do {
            System.out.println("Enter a string: ");
            input = scanner.nextLine();
        }while (input.length() == 0);

        //Initialize a counter for the 'a' characters
        int count = 0;

        //Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            //check if the character is 'a'
            if (input.charAt(i) == 'a') {
                count++;
            }
        }
        //Display the count of 'a' characters
        System.out.println("Total number of 'a' characters in the string: "+ count);
    }
    }