package Assignments.Week3.Bonus;

public class Shape {
    private String color;
    private boolean filled;
    public Shape(){
        color ="green";
        filled=true;
    }
    public Shape(String col,boolean fill){
        color=col;
        filled=fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "A Shape with color of "+color+" and "+((filled)?"Filled":"Not filled");
    }

}
