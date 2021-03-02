package Assignments.Week3.Assignment2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Animal[] an=new Animal[3];
        System.out.println("Enter name, gender and age of the bird:");
        an[0]=new Bird(in.nextLine(),in.nextLine(),in.nextInt());
        in.nextLine();
        System.out.println("Enter name, gender and age of the dog:");
        an[1]=new Dog(in.nextLine(),in.nextLine(),in.nextInt());
        in.nextLine();
        System.out.println("Enter name, gender and age of the cat:");
        an[2]=new Cat(in.nextLine(),in.nextLine(),in.nextInt());
        for(int i=0;i<3;i++){
            an[i].printing();
            an[i].eat();
            an[i].sleep();
            an[i].produceSound();
            System.out.println("\n");
        }
        int sum=0;
        int num=0;
        for(int i=0;i<3;i++){
            sum+=an[i].getAge();
            ++num;
        }
        System.out.println("The average age of animals is: "+(sum/num));
    }
}
