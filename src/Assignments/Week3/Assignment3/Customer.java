package Assignments.Week3.Assignment3;

public class Customer extends Person{
    private double total_expenses;


    public Customer(String fn, String ln) {
        super(fn, ln);
    }

    public double getTotal_expenses() {
        return total_expenses;
    }

    public void setTotal_expenses(double total_expenses) {
        this.total_expenses = total_expenses;
    }

    @Override
    public String toString(){
        return super.toString()+"\nClass: Customer\nNet purchase amount: "+getTotal_expenses();
    }
}
