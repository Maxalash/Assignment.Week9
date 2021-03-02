package Test;


import java.util.List;

public class Run_time {
    private List<Shape> shapes;
    public int getnumberofcircle(){
        int count=0;
        for(Shape shape:shapes){
            if(shape instanceof Circle){
                count++;
            }
        }
        return count;
    }
}
