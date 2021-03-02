package Assignments.Week3.Assignment1;

public class Worker extends Human {
    private double weekSalary;
    private int workHoursPerDay;
    public Worker(){}
    public Worker(String fname, String lname, double wekSalary, int workhours){
        super(fname,lname);
        this.weekSalary=wekSalary;
        this.workHoursPerDay=workhours;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    public int getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(int workHoursPerDay) {
        this.workHoursPerDay = workHoursPerDay;
    }

    public double moneyPerHour(){
        int weekhours=workHoursPerDay*5;
        return weekSalary/weekhours;
    }
    @Override
    public void printdata(){
        super.printdata();
        System.out.println("Work hours per day: "+workHoursPerDay+"\n"+"Money per hour: "+moneyPerHour()+"\n"+"Weekly salary: "+weekSalary);
    }
}
