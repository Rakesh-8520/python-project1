import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Subject 1: ");
        float marks1 = S.nextFloat();

        System.out.print("Enter marks for Subject 2: ");
        float marks2 = S.nextFloat();

        System.out.print("Enter marks for Subject 3: ");
        float marks3 = S.nextFloat();

        // Convert marks to grade points (scale of 10)
        float gp1 = marks1 / 10;
        float gp2 = marks2 / 10;
        float gp3 = marks3 / 10;

        // Calculate CGPA
        float cgpa = (gp1 + gp2 + gp3) / 3;

        System.out.printf("Your CGPA is: %.2f\n", cgpa);
    }
}