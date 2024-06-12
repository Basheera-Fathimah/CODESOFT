import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        
        
        int[] marks = new int[numberOfSubjects];
        
        
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.printf("Enter marks for subject %d (out of 100): ", i + 1);
            marks[i] = scanner.nextInt();
        }
        
        
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        
        
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        
        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        // Display results
        System.out.printf("Your Total Marks: %d%n", totalMarks);
        System.out.printf("Average Percentage Obtained: %.2f%%%n", averagePercentage);
        System.out.printf("Your Grade is: %c%n", grade);
        
        scanner.close();
    }
}


