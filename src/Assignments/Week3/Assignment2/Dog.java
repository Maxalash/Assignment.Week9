package Assignments.Week3.Assignment2;

public class Dog extends Animal{
    public Dog(String nam, String ag, int gen) {
        super(nam,ag,gen);
    }
    @Override
    public void eat(){
        System.out.println("Dog "+super.getName()+" ate some meat!");
    }
    public void sleep(){
        System.out.println("Dog "+super.getName()+" is sleeping! Hrrrh Frruuh...");
    }
    public void produceSound(){
        System.out.println("Bark!");
    }
    public void printing(){
        System.out.println("Data about dog:");
        super.printing();
    }
}
