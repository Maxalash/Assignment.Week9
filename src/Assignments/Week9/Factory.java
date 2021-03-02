package Assignments.Week9;

interface Transport{
    void deliver();
}
class Truck implements Transport{
    public void deliver(){
        System.out.println("Deliver by land in a box");
    }
}
class Ship implements Transport{
    public void deliver(){
        System.out.println("Deliver by sea in a box");
    }
}
abstract class Logistics{
    Transport t;
    public void planDeliver(){
        t=createTransport();
    }
    public abstract Transport createTransport();
}
class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport(){
        return new Truck();
    }
}
class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport(){
        return new Ship();
    }
}
public class Factory{
    public static void main(String[] args) {
        Logistics post=new RoadLogistics();
        post.planDeliver();
        post.t.deliver();
    }
}