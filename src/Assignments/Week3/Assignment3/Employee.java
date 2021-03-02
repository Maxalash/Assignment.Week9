package Assignments.Week3.Assignment3;
import java.util.Scanner;
public class Employee extends Person{
    private double salary;
    private double bonus;
    private String department;
    public Employee(){}
    public Employee(String fn, String ln,double sl,double bn,String dpt){
        super(fn, ln);
        this.salary=sl;
        this.bonus=bn;
        this.department=dpt;
    }

    public double getSalary() {
        return salary+bonus;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void checkdep(){
        if(this.getDepartment().equals("Production")||this.getDepartment().equals("Accounting")||this.getDepartment().equals("Sales")||this.getDepartment().equals("Marketing")){
            System.out.println("Checked!");
        }else{
            Scanner in=new Scanner(System.in);
            boolean check=true;
            do {
                System.out.println("You have entered wrong department! Please, enter nothing other than 'Production, Accounting, Sales, Marketing'");
                this.setDepartment(in.nextLine());
                if (this.getDepartment().equals("Production") || this.getDepartment().equals("Accounting") || this.getDepartment().equals("Sales") || this.getDepartment().equals("Marketing")) {
                    check = false;
                } else {
                    System.out.println("You have entered wrong department! Please, enter nothing other than 'Production, Accounting, Sales, Marketing'");
                }
            }while (check);
            System.out.println("Checked!");
            }
        }
}
