package Assignments.Week1.Assignment2;
import java.util.Scanner;
class Random {
    public int random() {
        int r = (int) Math.random();
        return r;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Warrior winner;
        System.out.println("Name first warrior:");
        Warrior a = new Warrior(sc.nextLine());
        System.out.println("Name second warrior:");
        Warrior b = new Warrior(sc.nextLine());
        System.out.println("Name first weapon:");
        Weapon hex = new Weapon(sc.nextLine());
        System.out.println("Add 'multiplication of the damage' ability of the first weapon:");
        hex.setDamage(sc.nextInt());
        System.out.println("Name second weapon:");
        Weapon sword = new Weapon(sc.nextLine());
        System.out.println("Add 'multiplication of the damage' ability of the second weapon:");
        sword.setDamage(sc.nextInt());
        System.out.println("Choose user for first weapon (0 or 1)");
        int ch = sc.nextInt();
        if (ch == 0) {
            a.setWeapon(hex);
            b.setWeapon(sword);
        } else {
            a.setWeapon(sword);
            b.setWeapon(hex);
        }
        System.out.println("The fighting is began!!");
        Random ran = new Random();
        do {
            if (ran.random() == 1) {
                b.fidam(a.Hit());
            } else {
                a.fidam(b.Hit());
            }
        } while (a.isnotAlive() || b.isnotAlive());
        if (a.isnotAlive()) {
            winner = b;
        } else {
            winner = a;
        }

        System.out.println("The results of fighting: Winner is " + winner.get());
        System.out.println("The results of fighting: Winner is " + b.get());
        System.out.println("The rest life of the winner is " + winner.get1());
    }
}
