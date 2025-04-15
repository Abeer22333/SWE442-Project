import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        double quiz;
        do {
            System.out.print("Enter score for Quiz (out of 10): ");
            quiz = input.nextDouble();
            if (quiz < 0) {
                System.out.println("Invalid input. Score cannot be negative.");
            }
        } while (quiz < 0);

        double midterm;
        do {
            System.out.print("Enter score for Midterm (out of 30): ");
            midterm = input.nextDouble();
            if (midterm < 0) {
                System.out.println("Invalid input. Score cannot be negative.");
            }
        } while (midterm < 0);

        double finalExam;
        do {
            System.out.print("Enter score for Final Exam (out of 60): ");
            finalExam = input.nextDouble();
            if (finalExam < 0) {
                System.out.println("Invalid input. Score cannot be negative.");
            }
        } while (finalExam < 0);

        double total = quiz + midterm + finalExam;
        double average = total / 3;

        System.out.println("\n--- Report ---");
        System.out.println("Student: " + name);
        System.out.println("Total Score: " + total + " / 100");
        System.out.println("Average Score: " + average);

        if (total >= 90) {
            System.out.println("Grade: A");
        } else if (total >= 80) {
            System.out.println("Grade: B");
        } else if (total >= 70) {
            System.out.println("Grade: C");
        } else if (total >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        input.close();
    }
}