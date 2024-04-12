package com.betrybe.rpg;

public class PlayableCharacter {
  private String name; // nome
  private String race; // raça (elfo, humano, orc)

  protected boolean isAlive;

  public PlayableCharacter() {
    this.isAlive = true;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public void move() {
    System.out.println("O personagem está se movendo.");
  }

  public void attack() {
    System.out.println("O personagem está atacando.");
  }
}
