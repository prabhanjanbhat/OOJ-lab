import java.util.Scanner;

class Subject {
    int subjectMarks;
    int credits;
    int grade;
}

class Student {
    String name;
    String usn;
    double SGPA;
    Scanner s;
    Subject[] subjects;

    // Constructor
    Student() {
        subjects = new Subject[9];
        for (int i = 0; i < 9; i++)
            subjects[i] = new Subject();
        s = new Scanner(System.in);
    }

    // Method to get student details
    void getStudentDetails() {
        System.out.println("Enter student name:");
        name = s.nextLine();
        System.out.println("Enter student USN:");
        usn = s.nextLine();
    }

    // Method to get marks and credits for 8 subjects
    void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            subjects[i].subjectMarks = s.nextInt();
            System.out.println("Enter credits for subject " + (i + 1) + ":");
            subjects[i].credits = s.nextInt();

            // Calculate grade based on marks
            if (subjects[i].subjectMarks >= 90) {
                subjects[i].grade = 10;
            } else if (subjects[i].subjectMarks >= 80) {
                subjects[i].grade = 9;
            } else if (subjects[i].subjectMarks >= 70) {
                subjects[i].grade = 8;
            } else if (subjects[i].subjectMarks >= 60) {
                subjects[i].grade = 7;
            } else if (subjects[i].subjectMarks >= 50) {
                subjects[i].grade = 6;
            } else if (subjects[i].subjectMarks >= 40) {
                subjects[i].grade = 5;
            } else {
                subjects[i].grade = 0; // Marks less than 40
            }
        }
    }

    // Method to compute SGPA
    void computeSGPA() {
        double totalCredits = 0;
        double weightedSum = 0;

        for (int i = 0; i < 8; i++) {
            totalCredits += subjects[i].credits;
            weightedSum += subjects[i].credits * subjects[i].grade;
        }

        SGPA = weightedSum / totalCredits;
    }

    // Display the result
    void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Student USN: " + usn);
        System.out.println("SGPA: " + SGPA);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getStudentDetails();
        s1.getMarks();
        s1.computeSGPA();
        s1.displayResult();
    }
}

