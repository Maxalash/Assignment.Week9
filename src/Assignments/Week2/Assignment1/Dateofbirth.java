package Assignments.Week2.Assignment1;
import java.util.Scanner;
public class Dateofbirth{
    private int year;
    private int month;
    private int day;
    public Dateofbirth(){
    }
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }
    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }
    public String toString(){
        return this.getYear()+"."+this.getMonth()+"."+this.getDay();
    }
}
