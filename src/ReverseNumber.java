import java.util.Scanner;

public class ReverseNumber {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); // Create a Scanner object to take input from the user

            System.out.print("Enter a 5 digit number: "); // Prompt the user to enter
            int number = input.nextInt(); // Read the number entered by the user using the Scanner class and store it in the 'number' variable

            int reversedNumber = 0; // Create a variable 'reversedNumber' and initialize it to 0
            while (number != 0) { // Use a while loop to reverse the number entered by the user
                int digit = number % 10; // Get the last digit of the number using the  operator (%)
                reversedNumber = reversedNumber * 10 + digit; // Add the last digit to the 'reversedNumber' variable after shifting it one place to the left
                number /= 10; // Remove the last digit from the 'number' variable by dividing it by 10
            }

            System.out.println("The reversed number is: " + reversedNumber); // Print the reversed number using the System.out.println() method
        }
    }


