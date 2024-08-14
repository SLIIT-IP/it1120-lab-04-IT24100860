import java.util.Scanner;

public class ITxxxxxxxxLab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input exam marks and validate
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            scanner.close();
            return;
        }

        // Input lab submission marks and validate
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            scanner.close();
            return;
        }

        // Input percentage taken from the exam mark and validate
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = scanner.nextDouble();
        if (examPercentage < 0 || examPercentage > 100) {
            System.out.println("Invalid input for exam percentage. Terminating program.");
            scanner.close();
            return;
        }

        // Input percentage taken from the lab submission mark and validate
        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = scanner.nextDouble();
        if (labPercentage < 0 || labPercentage > 100) {
            System.out.println("Invalid input for lab submission percentage. Terminating program.");
            scanner.close();
            return;
        }

        // Validate that the percentages add up to 100
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            scanner.close();
            return;
        }

        // Calculate the final mark
        double finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        // Display the final marks
        System.out.println("Final Exam Mark is: " + finalMarks);

        // Close the scanner
        scanner.close();
    }
}
