package com.betrybe.rpg;

public class Mage extends PlayableCharacter {
  private String spell; // magia

  public String getMagic() {
    return spell;
  }

  public void setMagic(String magic) {
    this.spell = magic;
  }

  @Override
  public void attack() {
    System.out.println("O mago lança um feitiço.");
  }
}
