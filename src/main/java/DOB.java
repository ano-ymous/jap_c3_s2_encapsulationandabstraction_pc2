package src.main.java;

public class DOB {
    private int date;
    private int month;
    private int year;
    DOB(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
