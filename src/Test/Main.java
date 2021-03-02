package Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
//        Generics
        Cenerics<Integer> nums= new Cenerics<>();
        nums.addNumber(5);
        nums.addNumber(7);
        nums.print();
//        Reflection (Dark side of Java)
//        try{
//            Circle circle=new Circle();
//            Field[] fields=new Field[];
//            Method[] methods=new Method[];
//            for (Field field:fields){
//                System.out.println(field.getName());
//            }
//            for (Method method:methods){
//                System.out.println(method.getName());
//            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }

    }
}
