package Assignments.Week3.Assignment3;

public class SalesEmployee extends RegularEmployee{
    private String prod_name;
    private double price;
    public SalesEmployee(double sl){super.setSalary(sl);}
    public SalesEmployee(String fn, String ln,String tp, double sl, double bn, String dpt,String pn,double pr) {
        super(fn, ln, sl, bn, dpt,tp);
        this.prod_name=pn;
        this.price=pr;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Data about sales employee:\n"+super.toString()+"\nProduct name: "+getProd_name()+"\nPrice: "+getPrice();
    }
}
