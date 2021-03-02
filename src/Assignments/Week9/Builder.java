package Assignments.Week9;

class House{
    private String wall;
    private String door;
    private String windows;
    private String roof;
    private String garage;

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getWall() {
        return wall;
    }

    public String getDoor() {
        return door;
    }

    public String getWindows() {
        return windows;
    }

    public String getRoof() {
        return roof;
    }

    public String getGarage() {
        return garage;
    }
}

interface HouseBuilder{
    void buildWalls();
    void buildDoors();
    void buildWindows();
    void buildRoof();
    void buildGarage();
    House getResult();

}

class HouseBuilder1 implements HouseBuilder{
    House hou=new House();
    public void buildWalls(){hou.setWall("wooden");}
    public void buildDoors(){hou.setDoor("wooden");}
    public void buildWindows(){hou.setWindows("glass");}
    public void buildRoof(){hou.setRoof("wooden");}
    public void buildGarage(){hou.setGarage("wooden");}
    public House getResult(){
        return hou;
    };
}

class HouseBuilder2 implements HouseBuilder{
    House hou= new House();
    public void buildWalls(){hou.setWall("stone");};
    public void buildDoors(){hou.setDoor("wooden");};
    public void buildWindows(){hou.setWindows("glass");};
    public void buildRoof(){hou.setRoof("wooden");};
    public void buildGarage(){hou.setRoof("wooden");};
    public House getResult(){
        return hou;
    };
}

class Director{
    HouseBuilder builder;
    public Director(HouseBuilder build){
        builder=build;
    }
    public void changeBuilder(HouseBuilder build){
        builder=build;
    }
    public void make(String type){
        if(type=="simple"){
            builder.buildWalls();
            builder.buildDoors();
            builder.buildRoof();
        }else{
            builder.buildWalls();
            builder.buildDoors();
            builder.buildRoof();
            builder.buildWindows();
            builder.buildGarage();
        }
    }
}

public class Builder {
    public static void main(String[] args) {
        HouseBuilder b=new HouseBuilder1();
        Director d=new Director(b);
        d.make("simple");
        House h=b.getResult();
        System.out.println("Wall: "+h.getWall()+
                "\nDoor: "+h.getDoor()+
                "\nRoof: "+h.getRoof()+
                "\nWindow: "+h.getWindows()+
                "\nGarage: "+h.getGarage());
    }
}
