package Assignments.Week3.Assignment2;

public class Bird extends Animal{

    public Bird(String nam, String ag, int gen) {
        super(nam,ag,gen);
    }

    @Override
    public void eat(){
        System.out.println("Bird "+super.getName()+" ate some warms!");
    }
    public void sleep(){
        System.out.println("Bird "+super.getName()+" is sleeping!");
    }
    public void produceSound(){
        System.out.println("Chirp chirp ...");
    }
    public void printing(){
        System.out.println("Data about bird:");
        super.printing();
    }
}
