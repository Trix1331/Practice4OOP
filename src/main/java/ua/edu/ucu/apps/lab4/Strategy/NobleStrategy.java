package ua.edu.ucu.apps.lab4.Strategy;

import java.util.Random;

import ua.edu.ucu.apps.lab4.Character;

public class NobleStrategy extends KickStrategy {
   private static final Random RANDOM = new Random();

   public NobleStrategy() {
   }

   public void kick(Character main, Character enemy) {
      enemy.setHp(enemy.getHp() - RANDOM.nextInt(main.getPower()));
   }
}
