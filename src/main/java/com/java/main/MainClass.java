package com.java.main;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade to store (1- 10) : ");
        int gradeNo = scanner.nextInt();
        Grade grade = new Grade(gradeNo);
        Subject[] subjects = null;
        System.out.print("Enter no of subjects to grade-"+gradeNo + " : ");
        int numberOfSubjects = scanner.nextInt();
        scanner.nextLine();
        subjects = new Subject[numberOfSubjects];
        for(int i = 0; i<numberOfSubjects; i++){
            System.out.print("Enter subject code : ");
            String subjectCode = scanner.nextLine();
            System.out.print("Enter subject name : ");
            String subjectName = scanner.nextLine();
            subjects[i] = new Subject(subjectCode,subjectName);
        }
        grade.setSubjects(subjects);
        System.out.println("Enter number of students : ");
        int noOfStudnets = scanner.nextInt();
        Student[] students = new Student[noOfStudnets];
        for(int i=0; i<noOfStudnets; i++){
            scanner.nextLine();
            System.out.println("Enter student rollno : ");
            String rollno = scanner.nextLine();
            System.out.println("Enter student name : ");
            String studentName = scanner.nextLine();
            students[i] = new Student(rollno,studentName,grade);
            Mark[] marks = new Mark[grade.getSubjects().length];
            int j = 0;
            for(Subject s : grade.getSubjects()){
                System.out.println("Enter marks of "+s.getSubjectName());
                int mark = scanner.nextInt();
                marks[j++] = new Mark(s , mark);
            }
            students[i].setMarks(marks);

        }
        grade.setStudents(students);
        grade.sortStudents();
        //System.out.println(Arrays.toString(grade.getStudents()));
        System.out.println(grade.topScorer());
        //System.out.println(Arrays.toString(grade.getSubjects()));
    }
}
