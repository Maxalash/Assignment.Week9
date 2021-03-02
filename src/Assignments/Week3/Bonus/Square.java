package Assignments.Week3.Bonus;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String col, boolean fill, double side) {
        super(col, fill, side, side);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setHeight(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setHeight(double side){
        super.setHeight(side);
    }
    public String toString(){
        return "A Square with side="+super.getWidth()+", which is a subclass of "+super.toString();
    }
}
