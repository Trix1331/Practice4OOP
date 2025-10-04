// package ua.edu.ucu.apps.lab4;

// public class Elf extends Character {

//     public Elf() {
//         super(10, 10);
//     }

//     @Override
//     public void kick(Character character) {
//         character.setHp(character.getHp() - this.getPower());
//     }
// }
package lotr;

import ua.edu.ucu.apps.lab4.Strategy.ElfKickStrategy;

public class Elf extends Character {
   public Elf() {
      super(10, 10, new ElfKickStrategy());
   }
}