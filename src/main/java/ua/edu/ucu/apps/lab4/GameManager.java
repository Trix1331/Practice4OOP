package ua.edu.ucu.apps.lab4;

public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println("Fight begins between " + c1 + " and " + c2);
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }
            System.out.println(c1);
            System.out.println(c2);
            System.out.println("----------");
        }

        if (c1.isAlive()) {
            System.out.println("Winner: " + c1);
        } else if (c2.isAlive()) {
            System.out.println("Winner: " + c2);
        } else {
            System.out.println("Both characters are dead!");
        }
    }
}
