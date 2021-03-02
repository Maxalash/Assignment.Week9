package Assignments.Week2.Assignment2;
import java.util.*;
public class Point {
    private int x;
    private int y;
    int[] qu = new int[5];


    public Point(int x,int y){
        this.x=x;
        this.y=y;
        int[] au = new int[5];
        int i=0;
        while(i<5){
            au[i++]=0;
        }
        this.qu=au;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getQu() {
        return qu;
    }

    public void sortquad(){
        if (x > 0 && y > 0){
            qu[0]++;
        }else if (x < 0 && y > 0){
            qu[1]++;
        }
        if (x < 0 && y < 0){
            qu[2]++;
        }
        if (x > 0 && y < 0){
            qu[3]++;
        }
        if (x == 0 || y == 0){
            qu[4]++;
        }
    }

}
