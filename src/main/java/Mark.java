package src.main.java;

public class Mark {
    private Subject subject;
    private int marks;
    Mark(Subject subject,int marks){
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
}
