package lotr;

import ua.edu.ucu.apps.lab4.Strategy.HobbitKickStrategy;

public class Hobbit extends Character {

    public Hobbit() {

        super(0, 3, new HobbitKickStrategy());

    }

}