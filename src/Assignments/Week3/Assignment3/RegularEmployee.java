package Assignments.Week3.Assignment3;

public class RegularEmployee extends Employee{
    private String type;
    public RegularEmployee(){}
    public RegularEmployee(String fn, String ln, double sl, double bn, String dpt,String tp) {
        super(fn, ln, sl, bn, dpt);
        this.type=tp;
    }
}
