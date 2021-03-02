package Assignments.Week3.Assignment1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Student[] stdy=new Student[10];
        Worker[] wkr=new Worker[10];
        for(int i=0;i<10;i++){
            stdy[i]=new Student();
            wkr[i]=new Worker();
        }
        for(int i=0;i<2;i++){
            System.out.println("Enter first name of "+(i+1)+" student: ");
            stdy[i].setFirst_name(in.nextLine());
            System.out.println("Enter second name of "+(i+1)+" student: ");
            stdy[i].setLast_name(in.nextLine());
            System.out.println("Enter faculty number of "+(i+1)+" student: ");
            stdy[i].setFaculty_number(in.nextLine());
        }
        for(int i=0;i<2;i++){
            System.out.println("Enter first name of "+(i+1)+" worker: ");
            wkr[i].setFirst_name(in.nextLine());
            System.out.println("Enter second name of "+(i+1)+" worker: ");
            wkr[i].setLast_name(in.nextLine());
            System.out.println("Enter week salary (double) of "+(i+1)+" worker: ");
            wkr[i].setWeekSalary(in.nextDouble());
            System.out.println("Enter work hours per day (int) of "+(i+1)+" worker: ");
            wkr[i].setWorkHoursPerDay(in.nextInt());
            in.nextLine();
        }
        for (int i=0;i<10;i++){
            System.out.println("Data about "+(i+1)+" student: ");
            stdy[i].printdata();
            System.out.println("\n");
        }
        for (int i=0;i<10;i++){
            System.out.println("Data about "+(i+1)+" worker: ");
            wkr[i].printdata();
            System.out.println("\n");
        }
    }
}
