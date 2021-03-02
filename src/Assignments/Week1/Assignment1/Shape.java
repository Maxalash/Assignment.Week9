package Assignments.Week1.Assignment1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Shape {
    private List<Point> numberList;

    public Shape() {
        Scanner sc = new Scanner(System.in);
        List<Point> mylist = new ArrayList<Point>();
        System.out.print("Enter number of iterations: ");
        int numberOfIterations = sc.nextInt();

        for (int i = 0; i < numberOfIterations; i++) {
            Point num = new Point();
            num.setX(sc.nextInt());
            num.setY(sc.nextInt());
            mylist.add(num);
        }
        this.numberList = mylist;
    }

    public List<Point> getPoint() {
        return numberList;
    }

    public void addPoint(List<Point> numberList) {
        this.numberList = numberList;
    }
    public double Perimeter(){
        double sumPeri=0;
        for(int i=0; i<numberList.size()-1;i++){
            sumPeri += numberList.get(i).Distance(numberList.get(i+1).getX(),numberList.get(i+1).getY());
        }
        sumPeri += numberList.get(numberList.size()).Distance(numberList.get(0).getX(),numberList.get(0).getY());
        return sumPeri;
    }
    public int Longest(){
        double leng=0;
        int id=0;
        for(int i=0; i<numberList.size()-1;i++){
            if (leng<numberList.get(i).Distance(numberList.get(i+1).getX(),numberList.get(i+1).getY())){
                leng=numberList.get(i).Distance(numberList.get(i+1).getX(),numberList.get(i+1).getY());
                id=i;
            }
        }
        return id;
    }
    public double ave(){
        return Perimeter()/ numberList.size();
    }

}
