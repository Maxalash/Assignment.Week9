package Assignments.Week3.Assignment2;

public class Cat extends Animal{
    public Cat(String nam, String ag, int gen) {
        super(nam,ag,gen);
    }
    @Override
    public void eat(){
        System.out.println("Cat "+super.getName()+" ate some fish!");
    }
    public void sleep(){
        System.out.println("Cat "+super.getName()+" is sleeping! Mrrr ...");
    }
    public void produceSound(){
        System.out.println("Nyaa!");
    }
    public void printing(){
        System.out.println("Data about cat:");
        super.printing();
    }
}
