package Assignments.Week9;

interface Chair{
    void design();
}
class VictorianChair implements Chair{
    public void design(){
        System.out.println("The design of the chair is victorian");
    }
}
class ModernChair implements Chair{
    public void design(){
        System.out.println("The design of the chair is modern");
    }
}
interface Sofa{
    void design();
}
class VictorianSofa implements Sofa{
    public void design(){
        System.out.println("The design of th Sofa is victorian");
    }
}
class ModernSofa implements Sofa{
    public void design(){
        System.out.println("The design of th Sofa is modern");
    }
}
interface CoffeeTable{
    void design();
}
class VictorianCoffeeTable implements CoffeeTable{
    public void design(){
        System.out.println("The design of th CoffeeTable is victorian");
    }
}
class ModernCoffeeTable implements CoffeeTable{
    public void design(){
        System.out.println("The design of th CoffeeTable is modern");
    }
}

interface FurnitureFactory{
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
class VictorianFactory implements FurnitureFactory{
    public Chair createChair(){
        return new VictorianChair();
    }
    public Sofa createSofa(){
        return new VictorianSofa();
    }
    public CoffeeTable createCoffeeTable(){
        return new VictorianCoffeeTable();
    }
}
class ModernFactory implements FurnitureFactory{
    public Chair createChair(){
        return new ModernChair();
    }
    public Sofa createSofa(){
        return new ModernSofa();
    }
    public CoffeeTable createCoffeeTable(){
        return new ModernCoffeeTable();
    }
}

class Client{
    FurnitureFactory factory;
    public Client(FurnitureFactory fac){
        factory=fac;
    }

}

public class AbstractFactory{
    public static void main(String[] args) {
        FurnitureFactory fac=new VictorianFactory();
        Client a=new Client(fac);
        Chair ch=fac.createChair();
        ch.design();
    }
}