package Assignments.Week3.Assignment2;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void eat(){
        System.out.println("Animal have been fed!");
    }
    public void sleep(){
        System.out.println("Z z z...");
    }
    public void produceSound(){
        System.out.println("sound of animal");
    }
    public void printing(){
        System.out.println("Name: "+getName()+"\nAge: "+getAge()+"\nGender: "+getGender());
    }
}
