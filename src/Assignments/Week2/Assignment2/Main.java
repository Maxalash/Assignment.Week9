package Assignments.Week2.Assignment2;
import java.lang.Math;
public class Main {
    public static void main(String[] args){
        int[] au = new int[5];
        for (int j = 0; j < 100; j++) {
            int rx = (int)(Math.random() * 301 - 150);
            int ry = (int)(Math.random() * 301 - 150);
            Point point = new Point(rx, ry);
            point.sortquad();
            int a[] = point.getQu();
            au[0] += a[0];
            au[1] += a[1];
            au[2] += a[2];
            au[3] += a[3];
            au[4] += a[4];
        }
        System.out.println("I quadrant: "+au[0] + "\n" +
                "II quadrant: "+au[0] + "\n" +
                "III quadrant: "+au[0] + "\n" +
                "IV quadrant: "+au[0] + "\n" +
                "On axes: "+au[4] + "\n");
    }
}
