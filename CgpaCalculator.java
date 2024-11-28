import java.util.Scanner;

public class CgpaCalculator {
    private int totalCreditHours;
    private double totalGradePoints;

    public CgpaCalculator() {
        totalCreditHours = 0;
        totalGradePoints = 0;
    }

    public void addCourse(int creditHours, double gradePoints) {
        totalCreditHours += creditHours;
        totalGradePoints += gradePoints * creditHours;
    }

    public double getGPA() {
        return totalGradePoints / totalCreditHours;
    }

    public static void main(String[] args) {
        CgpaCalculator semester1 = new CgpaCalculator();
        CgpaCalculator semester2 = new CgpaCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of courses in Semester 1:");
        int numCourses = scanner.nextInt();
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter the credit hours and grade points for Course " + (i + 1) + ":");
            int creditHours = scanner.nextInt();
            double gradePoints = scanner.nextDouble();
            semester1.addCourse(creditHours, gradePoints);
        }

        System.out.println("Enter the number of courses in Semester 2:");
        numCourses = scanner.nextInt();
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter the credit hours and grade points for Course " + (i + 1) + ":");
            int creditHours = scanner.nextInt();
            double gradePoints = scanner.nextDouble();
            semester2.addCourse(creditHours, gradePoints);
        }

        double gpa1 = semester1.getGPA();
        double gpa2 = semester2.getGPA();
        double cgpa = (gpa1 + gpa2) / 2;

        System.out.printf("GPA for Semester 1: %.2f\n", gpa1);
        System.out.printf("GPA for Semester 2: %.2f\n", gpa2);
        System.out.printf("CGPA for the year: %.2f\n", cgpa);
    }
}
