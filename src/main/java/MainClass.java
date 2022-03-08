package src.main.java;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade to store (1- 10) : ");
        int gradeNo = scanner.nextInt();
        Grade grade = new Grade(gradeNo);
        Subject[] subjects = null;
        int numberOfSubjects = scanner.nextInt();
        subjects = new Subject[numberOfSubjects];
        for(int i = 0; i<numberOfSubjects; i++){
            System.out.print("Enter subject name : ");
            String subjectName = scanner.next();
            Subject subject = new Subject(subjectName);
            subjects[i] = subject;
        }
        grade.setSubjects(subjects);
        System.out.println("Enter number of students : ");
        int noOfStudnets = scanner.nextInt();
        for(int i=0; i<noOfStudnets; i++){
            System.out.println("Enter student rollno : ");
            String rollno = scanner.next();
            System.out.println("Enter student name : ");
            String studentName = scanner.next();
            Student student = new Student(rollno,studentName,grade);
            Mark[] marks = new Mark[grade.getSubjects().length];
            int j = 0;
            for(Subject s : grade.getSubjects()){
                System.out.println("Enter marks of "+s.getSubjectName());
                int mark = scanner.nextInt();
                Mark tempMark = new Mark(s , mark);
                marks[j++] = tempMark;
            }
            student.setMarks(marks);
        }
        grade.sortStudents();
    }
}
