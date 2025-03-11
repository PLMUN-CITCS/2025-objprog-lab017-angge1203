import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        int score = getStudentScore();
        
        String grade = calculateGrade(score);
        
        System.out.println("Your Grade is: " + grade);
    }

    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        System.out.print("Enter your score: ");
        
        while (true) {
            if (scanner.hasNextInt()) {
                score = scanner.nextInt();
                
                if (score >= 0 && score <= 100) {
                    break; // Exit the loop if the score is valid
                } else {
                    System.out.println("Please enter a score between 0 and 100.");
                    System.out.print("Enter your score: ");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
                System.out.print("Enter your score: ");
            }
        }

        return score;
    }

    public static String calculateGrade(int score) {
        String grade;
        
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        return grade;
    }
}
