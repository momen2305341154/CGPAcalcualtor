import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numCourses;
        double[] credits;
        double[] grades;
        double totalCredits = 0;
        double totalGradePoints = 0;
        double CGPA;
        // get the number of courses
        System.out.println("Enter the number of courses:");
        numCourses = input.nextInt();
        // create arrays to store credits and grades
        credits = new double[numCourses];
        grades = new double[numCourses];

        // get credits and grades for each course
        for (int i=0; i<numCourses; i++) {
            System.out.printf("Enter the credit hours for courses", i+1);
            credits[i] = input.nextDouble();
            System.out.printf("Enter the grade for each course %d (out of 4.0)", i+1);
            grades[i] = input.nextDouble();
            totalCredits += credits[i];
            totalGradePoints += credits[i] * grades[i];
        }
        //calculate the cgpa
        CGPA = totalGradePoints / totalCredits;

        //display the result
        System.out.printf("Your CGPA is %.2f", CGPA);


    }
}