package com.java.main;

public class Subject {
    private String subjectCode;
    private String subjectName;
    private float averageScore;
    private int noOfStudents;
    public Subject(String subjectCode,String subjectName){
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    @Override
    public String toString() {
        return "subjectCode= " + subjectCode +
                ", subjectName= " + subjectName+
                ", averageScore=" + averageScore +
                ", noOfStudents=" + noOfStudents;
    }
}
