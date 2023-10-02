import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a list of numbers
        System.out.print("Enter a list of numbers separated by spaces: ");
        String userInput = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Call the calculateAverage method and pass the user input
        double average = calculateAverage(userInput);

        // Print the average
        System.out.println("Average: " + average);
    }

    public static double calculateAverage(String input) {
        // Split the input string into an array of strings
        String[] values = input.split(" ");

        // Create an ArrayList to store the numeric values
        ArrayList<Integer> numberList = new ArrayList<>();

        // Convert the string values to integers and add them to the ArrayList
        for (String value : values) {
            try {
                int num = Integer.parseInt(value);
                numberList.add(num);
            } catch (NumberFormatException e) {
                // Handle invalid input (non-numeric values)
                System.out.println("Invalid input: " + value + " is not a valid number.");
            }
        }

        // Calculate the total
        int total = 0;
        for (int number : numberList) {
            total += number;
        }

        // Calculate the average
        double average = (double) total / numberList.size();

        return average;
    }
}
