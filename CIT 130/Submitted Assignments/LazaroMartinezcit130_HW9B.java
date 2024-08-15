/*
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file LazaroMartinezcit130_HW9B.java
@version The date as 2024-04-21
@note Time taken ~2 hours, spread out
@program this program manages students records using ArrayList
it allows the user to add, remove, search or delete records
*/

import java.util.ArrayList;
import java.util.Scanner;

public class LazaroMartinezcit130_HW9B {
    static Scanner input = new Scanner(System.in);// global scanner utility

    public static void main(String[] args) {
        // initialize arraylists
        ArrayList<Integer> studentID = new ArrayList<>();
        ArrayList<String> studentName = new ArrayList<>();
        ArrayList<String> studentCourse = new ArrayList<>();
        ArrayList<Double> courseCredits = new ArrayList<>();
        ArrayList<Double> examScores = new ArrayList<>();

        // call methods with headers from the sample run
        addStudentData(studentID, studentName, studentCourse, courseCredits, examScores);
        System.out.println("Display student data");
        displayStudentRecords(studentID, studentName, studentCourse, courseCredits, examScores);
        System.out.println("Search student by ID");
        searchStudentByID(studentID, studentName, studentCourse, courseCredits, examScores);
        System.out.println("Let's add another student to the list");
        addStudentData(studentID, studentName, studentCourse, courseCredits, examScores);
        System.out.println("Display new student data");
        displayStudentRecords(studentID, studentName, studentCourse, courseCredits, examScores);
        System.out.println("Remove student data from the list after graduating");
        removeStudentByID(studentID, studentName, studentCourse, courseCredits, examScores);
        System.out.println("Display student records");
        displayStudentRecords(studentID, studentName, studentCourse, courseCredits, examScores);
    }// main method

    public static void addStudentData(ArrayList<Integer> studentID, ArrayList<String> studentName,
            ArrayList<String> studentCourse, ArrayList<Double> courseCredits, ArrayList<Double> examScores) {
        String choice;
        do {
            System.out.println("Enter Student ID or 'Done' to stop:");
            choice = input.nextLine();
            if (!choice.equalsIgnoreCase("Done")) {// skip the rest of the prompts if the user already chose to exit
                int ID = Integer.parseInt(choice);
                System.out.println("Enter Student Name:");
                String name = input.nextLine();
                System.out.println("Enter Student Course:");
                String course = input.nextLine();
                System.out.println("Enter Course Credits:");
                double credits = input.nextDouble();
                System.out.println("Enter Exam Scores:");
                double scores = input.nextDouble();
                input.nextLine();// consume newline character

                // add data to the arraylists
                studentID.add(ID);
                studentName.add(name);
                studentCourse.add(course);
                courseCredits.add(credits);
                examScores.add(scores);

            }
        } while (!choice.equalsIgnoreCase("Done"));// this checks the user's choice to exit the program
    }// add student data method

    public static void displayStudentRecords(ArrayList<Integer> studentID, ArrayList<String> studentName,
            ArrayList<String> studentCourse, ArrayList<Double> courseCredits, ArrayList<Double> examScores) {
        System.out.println("Student ID\tStudent Name\tStudent Course\tCourse Credits\tExam Scores");
        for (int i = 0; i < studentID.size(); i++) {
            System.out.printf("%d\t\t%s\t\t%s\t%.2f\t\t%.2f\n", studentID.get(i),
                    studentName.get(i), studentCourse.get(i), courseCredits.get(i), examScores.get(i));
        }
    }// display student records method

    public static void searchStudentByID(ArrayList<Integer> studentID, ArrayList<String> studentName,
            ArrayList<String> studentCourse, ArrayList<Double> courseCredits, ArrayList<Double> examScores) {
        String choice;
        do {
            System.out.println("Enter Student ID to search or 'Done' to end the search:");
            choice = input.nextLine();
            if (!choice.equalsIgnoreCase("Done")) {
                int ID = Integer.parseInt(choice);
                int index = studentID.indexOf(ID);
                if (index >= 0) {
                    System.out.println("Student found");
                    System.out.printf(
                            "Student ID: %d\nStudent Name: %s\nStudent Course: %s\nCourse Credits: %.2f\nExam Scores: %.2f\n",
                            studentID.get(index), studentName.get(index), studentCourse.get(index),
                            courseCredits.get(index), examScores.get(index));
                } else {
                    System.out.println("Student not found.");
                }
            }
        } while (!choice.equalsIgnoreCase("Done"));// .equalsIgnoreCase checks for a matching string case insensitively
    }// search student method

    public static void removeStudentByID(ArrayList<Integer> studentID, ArrayList<String> studentName,
            ArrayList<String> studentCourse, ArrayList<Double> courseCredits, ArrayList<Double> examScores) {
        String choice;
        do {
            System.out.println("Enter Student ID to remove or 'Done' to cancel:");
            choice = input.nextLine();
            if (!choice.equalsIgnoreCase("Done")) {
                int ID = Integer.parseInt(choice);
                int index = studentID.indexOf(ID);
                if (index >= 0) {
                    studentID.remove(index);
                    studentName.remove(index);
                    studentCourse.remove(index);
                    courseCredits.remove(index);
                    examScores.remove(index);
                    System.out.println("Student removed.");
                } else {
                    System.out.println("Student not found. No data removed.");
                }
            }
        } while (!choice.equalsIgnoreCase("Done"));

    }// remove student method

}// class