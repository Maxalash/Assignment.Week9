package Assignments.Week3.Assignment3;

public class Manager extends Employee{
    private int team_mem_num;
    public Manager(String fn, String ln, double sl, double bn, String dpt,int tmn) {
        super(fn, ln, sl, bn, dpt);
        this.team_mem_num=tmn;
    }
    public Manager(double sl){
        super.setSalary(sl);
    }

    public int getTeam_mem_num() {
        return team_mem_num;
    }

    public void setTeam_mem_num(int team_mem_num) {
        this.team_mem_num = team_mem_num;
    }

    @Override
    public String toString(){
        return "Data about manager:\n"+super.toString()+"\nSalary: "+getSalary()+"\nDepartment: "+getDepartment()+"\nTeam members number: "+getTeam_mem_num();
    }
}
