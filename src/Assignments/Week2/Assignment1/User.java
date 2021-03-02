package Assignments.Week2.Assignment1;
import java.util.*;
public class User {
    private String firstName;
    private String secondName;
    private static int id_auto=0;
    private int id;
    private String gender;
    private String password;
    private Dateofbirth dateOFBirth=new Dateofbirth();
    public User(){
        this.id=id_auto++;;
    }
    public User(String firstName, String secondName,String gender,String password,int year,int month,int day){
        this.firstName=firstName;
        this.secondName=secondName;
        this.id=id_auto++;
        this.gender=gender;
        this.password=password;
        this.dateOFBirth.setDay(day);
        this.dateOFBirth.setMonth(month);
        this.dateOFBirth.setYear(year);

    }
    public String getfirstName(){
        return firstName;
    }
    public String getsecondName(){
        return secondName;
    }
    public int getid(){
        return id;
    }
    public String getgender(){
        return gender;
    }
    public String getpassword(){ return password; }
    public Dateofbirth getdateOFBirth(){
        return dateOFBirth;
    }
    public void setfirstName(String firtsName){
        this.firstName=firstName;
    }
    public void setsecondName(String secondName){
        this.secondName=secondName;
    }
    public void setgender(String gender){
        this.gender=gender;
    }
    public void setpassword(String password){
        this.password=password;
    }
    public void setdateOFBirth(int year,int month,int day){
        dateOFBirth.setYear(year);
        dateOFBirth.setMonth(month);
        dateOFBirth.setDay(day);
    }
    public void printdata(){
        System.out.println(this.firstName);
        System.out.println(this.secondName);
        System.out.println(this.id);
        System.out.println(this.gender);
        System.out.println(this.password);
        System.out.println(this.dateOFBirth);
    }
    public boolean checkAge(){
        Calendar date=Calendar.getInstance();
        int yea=date.get(Calendar.YEAR);
        int mon=date.get(Calendar.MONTH);
        int da=date.get(Calendar.DATE);
        if(yea-this.dateOFBirth.getYear()<=18){
            if(yea-this.dateOFBirth.getYear()==18&&mon<this.dateOFBirth.getMonth()){
                if(yea-this.dateOFBirth.getYear()==17&&mon==this.dateOFBirth.getMonth()&&da<this.dateOFBirth.getDay()){
                    return false;
                }
            }
        }
        return true;
    }
    public void getinfo(){
        System.out.println("Name: "+getfirstName()+"\n"+
                "Surname: "+getsecondName()+"\n"+
                "id: "+getid()+"\n"+
                "password: "+getpassword()+"\n"+
                "gender: "+getgender()+"\n"+
                "date of birth: "+getdateOFBirth().toString()
        );
    }
}
