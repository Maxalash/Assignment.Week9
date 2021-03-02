package Test;
import java.util.ArrayList;
import java.util.List;

public class Cenerics<type> {
    private List<type> numbers = new ArrayList<>();
    public void addNumber(type num){
        numbers.add(num);
    }
    public void print(){
        for(type num: numbers){
            System.out.println(num);
        }
    }

}
