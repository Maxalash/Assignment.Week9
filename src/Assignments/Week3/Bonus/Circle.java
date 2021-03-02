package Assignments.Week3.Bonus;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String col,boolean fill,double radius){
        super(col, fill);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="+radius+", which is a subclass of "+super.toString();
    }
}
