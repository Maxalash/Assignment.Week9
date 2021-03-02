package Assignments.Week3.Assignment1;

public class Student extends Human {
    private String faculty_number;
    public Student(){}
    public Student(String first_name, String last_name, String faculty_number){
            super(first_name,last_name);
            this.faculty_number=faculty_number;
    }

    public String getFaculty_number() {
        return faculty_number;
    }

    public void setFaculty_number(String faculty_number) {
        this.faculty_number = faculty_number;
    }
    @Override
    public void printdata(){
        super.printdata();
        System.out.println("Faculty number: "+faculty_number);
    }
}
