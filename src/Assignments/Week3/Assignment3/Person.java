package Assignments.Week3.Assignment3;

public class Person {
    private int id;
    private int id_auto=0;
    private String first_name;
    private String last_name;
    public Person(){}
    public Person(String fn,String ln){
        id=id_auto++;
        this.first_name=fn;
        this.last_name=ln;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String toString(){
        return "First name: "+getFirst_name()+"\nLast name: "+getLast_name()+
                "\nId: "+getId();
    }
}
