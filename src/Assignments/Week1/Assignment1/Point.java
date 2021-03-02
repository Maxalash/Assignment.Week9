package Assignments.Week1.Assignment1;

public class Point {
    public int x;
    public int y;
    public Point() {
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    double Distance(int х, int у) {
        int dx = this.x - х;
        int dy = this.y - у;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
