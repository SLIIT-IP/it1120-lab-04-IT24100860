import java.util.Scanner;

public class IT24100860Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Determine if the number is positive, negative, or zero using the ternary operator
        String result = (number > 0) ? "The number is Positive"
                      : (number < 0) ? "The number is Negative"
                      : "The number is Zero";

        // Display the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
