package Assignments.Week3.Bonus;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {
        width=1.0;
        height=1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String col, boolean fill, double width, double height) {
        super(col, fill);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+width+" and length="+height+", which is a subclass of "+super.toString();
    }
}
