package Assignments.Week1.Assignment2;

public class Weapon {
    private String name;
    private double damage;
    public Weapon(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public double getDamage(){
        return damage;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDamage(double damage){
        this.damage=damage;
    }
}
