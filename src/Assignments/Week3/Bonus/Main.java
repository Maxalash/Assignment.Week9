package Assignments.Week3.Bonus;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Circle c1=new Circle("red",true,13);
        System.out.println(c1.getPerimeter()+" "+ c1.getArea());
        Rectangle r1=new Rectangle("blur",false,24,10);
        System.out.println(r1.getArea()+" "+ r1.getPerimeter());
    }
}
