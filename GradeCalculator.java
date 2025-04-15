import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Enter score for Quiz (out of 10): ");
        double quiz = input.nextDouble();

        System.out.print("Enter score for Midterm (out of 30): ");
        double midterm = input.nextDouble();

        System.out.print("Enter score for Final Exam (out of 60): ");
        double finalExam = input.nextDouble();

        double total = quiz + midterm + finalExam;

        System.out.println("\n--- Report ---");
        System.out.println("Student: " + name);
        System.out.println("Total Score: " + total + " / 100");

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