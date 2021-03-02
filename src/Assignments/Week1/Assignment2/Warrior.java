package Assignments.Week1.Assignment2;

public class Warrior {
    private String name;
    private double life=1000;
    private double damage=100;
    public Warrior(String name){
        this.name=name;
    }
    public void set(String name){
        this.name=name;
    }
    public String get(){
        return name;
    }
    public double get1(){
        return life;
    }
    Weapon sw=new Weapon("swo");
    public void setWeapon(Weapon sw1){
        this.sw=sw1;
    }
    public void fidam( double x1){
        this.life=this.life-x1;
    }
    public double Hit(){
        return damage*sw.getDamage();
    }
    public boolean isnotAlive(){
        if(this.life>0){return true;}
        else{return false;}
    }
}
