import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Number of subjects or grades
        try ( // Create a scanner object to take input from the user
                Scanner scanner = new Scanner(System.in)) {
            // Number of subjects or grades
            int numberOfSubjects;
            System.out.print("Enter the number of subjects: ");
            numberOfSubjects = scanner.nextInt();
            
            // Array to store the grades
            double[] grades = new double[numberOfSubjects];
            double total = 0.0;
            
            // Input grades
            for (int i = 0; i < numberOfSubjects; i++) {
                System.out.print("Enter the number for subject " + (i + 1) + ": ");
                grades[i] = scanner.nextDouble();
                total += grades[i];
            }
            
            // Calculate the average
            double average = total / numberOfSubjects;
            
            // Display the average and grade classification
            System.out.printf("Your average grade is: %.2f\n", average);
            System.out.println("Your grade is: " + getGrade(average));
        }
    }

    // Method to determine the letter grade based on the average score
    public static String getGrade(double average) {
        if (average >= 88 && average <= 100) {
            return "A+";
        } else if (average >= 81 && average < 88) {
            return "A";
        } else if (average >= 68 && average < 81) {
            return "B+";
        } else if (average >= 58 && average < 68) {
            return "B";
        } else if (average >= 51 && average < 58) {
            return "C+";
        } else if (average >= 41 && average < 51) {
            return "C";
        } else if (average >= 35 && average < 41) {
            return "D";
        } else {
            return "F";
        }
    }
}
