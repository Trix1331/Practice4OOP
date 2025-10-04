package ua.edu.ucu.apps.lab4.Strategy;

import ua.edu.ucu.apps.lab4.Character;

public class ElfKickStrategy extends KickStrategy {
   public ElfKickStrategy() {
   }

   public void kick(Character main, Character enemy) {
      if (enemy.getHp() < main.getHp()) {
         enemy.setHp(0);
      } else {
         enemy.setPower(enemy.getPower() - 1);
      }

   }
}