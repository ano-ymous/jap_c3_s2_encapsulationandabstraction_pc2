package com.java.main;

public class Mark {
    private Subject subject;
    private int marks;
    public Mark(Subject subject,int marks){
        this.subject = subject;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }
    public String getStatus(){
        return marks<40 ? "Fail" : "Pass";
    }

    @Override
    public String toString() {
        return "subject=" + subject.getSubjectName() +
                ", marks=" + marks;
    }
}
