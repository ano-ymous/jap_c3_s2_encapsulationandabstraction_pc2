package src.main.java;

import java.util.Arrays;

public class Grade {
    private int grade;
    private Subject[] subjects = null;
    private Student[] students = null;
    private float averageGradeScore;
    private int noOfStudents;
    boolean sorted = false;
    Grade(int grade){
        this.grade = grade;
    }

    public Student topScorer(){
        return this.students[0];
    }

    public void sortStudents(){
        Arrays.sort(this.students,(a,b)->(b.getTotalMarks()-a.getTotalMarks()));
        sorted = true;
    }

    public void setNoOfStudents() {
        this.noOfStudents = this.students.length;
    }

    public  void addNewStudent(Student student){
        Student[] students = new Student[this.noOfStudents+1];
        int i=0;
        for(i =0; i<this.noOfStudents;i++){
            students[i] = this.students[i];
        }
        students[i] = student;
        this.students = students;
        sorted = false;
        this.noOfStudents++;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public float getAverageGradeScore() {
        return averageGradeScore;
    }

    public void setAverageGradeScore() {
        float total = 0;
        for(Subject i: this.subjects){
            total += i.getAverageScore();
        }
        this.averageGradeScore = total/this.noOfStudents;
    }

    public int getGrade() {
        return grade;
    }

    public Student[] getStudents() {
        return students;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setStudents(Student[] students) {
        this.students = students;
        sorted = false;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
        sorted = false;
    }
}
