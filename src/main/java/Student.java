package src.main.java;

import java.util.Comparator;
import java.util.Date;

public class Student implements Comparable {
    private String studentRollNo;
    private String studentName;
    private Grade grade;
    private Mark[] marks = null;
    Student(String studentRollNo,String studentName,Grade grade){
        this.studentRollNo = studentRollNo;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String getStudentRollNo() {
        return studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentRollNo(String studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void setMarks(Mark[] marks) {
        this.marks = marks;
    }

    public Mark[] getMarks(){
        return this.marks;
    }
    public void setMarksOfSubject(Subject subject,int modifiedMarks){
        for(Mark i: this.marks){
            if(i.getSubject().getSubjectName().equals(subject.getSubjectName())){
                float dummy = modifiedMarks - i.getMarks();
                i.setMarks(modifiedMarks);
                i.getSubject().setAverageScore((i.getSubject().getAverageScore()-dummy)*i.getSubject().getNoOfStudents());
            }
        }
    }

    public String getStatus(Subject subject){
        for(Mark i: this.marks){
            if(i.getSubject().getSubjectName().equals(subject)) return i.getStatus();
        }
        return "No such subject for student of this grade";
    }

    public int getTotalMarks(){
        int totalMarks = 0;
        for(Mark i: this.marks){
            totalMarks += i.getMarks();
        }
        return totalMarks;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
