package Assignments.Week3.Assignment3;

public class Developer extends RegularEmployee{
    private String proj_name;
    private String details;
    private String state;
    public Developer(double sl){super.setSalary(sl);}
    public Developer(String fn, String ln,String tp, double sl, double bn, String dpt,String pn,String dt,String st) {
        super(fn, ln, sl, bn, dpt,tp);
        this.proj_name=pn;
        this.details=dt;
        this.state=st;
    }

    public void closeProject(){
        this.state="closed";
    }

    public String getProj_name() {
        return proj_name;
    }

    public void setProj_name(String proj_name) {
        this.proj_name = proj_name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString(){
        return "Data about sales employee:\n"+super.toString()+"Project of developer: "+getProj_name()+"\nDetails: "+getDetails()+"\nState of project: "+getState();
    }
}
