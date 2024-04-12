package com.betrybe.rpg;

public class Main {

  public static void main(String[] args) {
    Cleric cleric = new Cleric();
    cleric.heal();                       // Cura básica
    cleric.heal("Poção de Vida");        // Cura com a Poção de Vida
    cleric.heal("Feitiço de Luz", 7);    // Cura com Feitiço de Luz e poder 7
  }
}