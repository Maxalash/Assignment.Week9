package Assignments.Week2.Assignment1;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Calendar date=Calendar.getInstance();
        int yea=date.get(Calendar.YEAR);
        int mon=date.get(Calendar.MONTH);
        int da=date.get(Calendar.DATE);
        boolean check=true;
        System.out.println("Please input user data(first name, second name, gender, password, year of birth, month of birth, day of birth:");
        User person=new User();
        System.out.print("Enter first name:");
        person.setfirstName(in.nextLine());
        System.out.print("Enter second name:");
        person.setsecondName(in.nextLine());
        do{System.out.print("Enter gender:");
            person.setgender(in.nextLine());
            if(person.getgender().equals("male")||person.getgender().equals("female")){
                check=false;
            }else{
                System.out.println("You have entered wrong!! It should be either 'male' or 'female'");
            }
        }while(check);
        check=true;
        do{System.out.print("Enter password at least 8 characters:");
            person.setpassword(in.nextLine());
            if(person.getpassword().length()<8){
                System.out.println("You have entered not enough!! Please rewrite your password");
            }else{
                check=false;
            }
        }while(check);
        check=true;
        Calendar date2=Calendar.getInstance();
        date2.set(person.getdateOFBirth().getYear(),person.getdateOFBirth().getMonth(),person.getdateOFBirth().getDay());
        int maxday=date2.getActualMaximum(Calendar.DAY_OF_MONTH);
        int pyea=person.getdateOFBirth().getYear();
        int pmon=person.getdateOFBirth().getMonth();
        int pday=person.getdateOFBirth().getDay();
        do{System.out.print("Enter your year of birth:");;
            person.getdateOFBirth().setYear(in.nextInt());
            if(person.getdateOFBirth().getYear()>yea){
                System.out.println("You have entered wrong year!!");
            }else{
                check=false;
            }
        }while(check);
        check=true;
        do{System.out.print("Enter your month of birth:");;
            person.getdateOFBirth().setMonth(in.nextInt());
            if(pyea==yea&&pmon>mon||pmon>12){
                System.out.println("You have entered wrong month!!");
            }else{
                check=false;
            }
        }while(check);
        check=true;

        do{System.out.print("Enter your day of birth:");
            person.getdateOFBirth().setDay(in.nextInt());
            if(pyea==yea&&pmon==mon&&pday>da||pday>maxday){
                System.out.println("You have entered wrong day!!");
            }else{
                check=false;
            }
        }while(check);
        if (person.checkAge()){
            person.getinfo();
        }else{System.out.println("You are a underage, so your actions are restricted");}

    }

}
