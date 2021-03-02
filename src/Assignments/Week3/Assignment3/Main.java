package Assignments.Week3.Assignment3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Manager[] man=new Manager[2];
        man[0]=new Manager("Jasper","Karnel",25000.25,1500,"Production",45);
//        man[1].checkdep(); man[0].checkdep();
        man[1]=new Manager("Janper","Karnel",22000.25,150,"Sales",100);
        SalesEmployee[] se=new SalesEmployee[2];
        se[0]=new SalesEmployee("Jeron","Karnel","Office worker",20000.25,15000,"Marketing","car",100000.50);
        se[1]=new SalesEmployee("Jack","Adam","Office worker",27000.25,160,"Sales","paper",50.20);
        Developer[] dv=new Developer[2];
        dv[0]=new Developer("Cruis","Novel","Office worker",20000,500,"Accounting","Macintosh","New computer","open");
        dv[1]=new Developer("Karter","Packson","Office worker",24000,5000,"Accounting","Aqua+","Alternative energy","open");
        dv[0].closeProject();
        for(int i=0;i<1;i++){
            System.out.println(man[i].toString()+"\n");
            System.out.println(se[i].toString()+"\n");
            System.out.println(dv[i].toString()+"\n");
        }
//        Employee[][] em=new Employee[2][2];
//        em[0]=new Manager("Jasper","Karnel",25000.25,1500,"Production");
//        em[0].checkdep();
//        em[1]=new Manager("Jeron","Karnel",20000.25,15000,"Marketing");
//        em[1].checkdep();
//        em[2].new SalesEmployee()
    }
}
