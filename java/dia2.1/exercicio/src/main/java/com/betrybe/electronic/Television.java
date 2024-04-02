package com.betrybe.electronic;

/**
 * The type Television.
 */
public class Television {

  private static int MAX_VOLUME = 30;
  private int volume = 0;
  private static double INCH_TO_CM = 2.54;

  private boolean isOn = false;

  private String brand;
  private String model;
  private int size;

  public Television(String brand, String model, int size) {
    this.brand = brand;
    this.model = model;
    this.size = size;
  }

  public void turnOn() {
    System.out.println("Ligando televisão...");
    isOn = true;
  }

  public void turnOff() {
    System.out.println("Desligando televisão...");
    isOn = false;
  }

  public void increaseVolume() {
    if (volume < MAX_VOLUME) {
      volume++;
    }
  }

  public void decreaseVolume() {
    if (volume > 0) {
      volume--;
    }
  }

  public String info() {
    return "Marca: %s, Modelo: %s, Tamanho: %d, Ligada: %b".formatted(
        brand, model, size, isOn
    );
  }

  public int getVolume() {
    return volume;
  }

  public boolean isOn() {
    return isOn;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public int getSize() {
    return size;
  }

  public static String convertToCentimeters(double inches) {
    double sizeCm = inches * INCH_TO_CM;
    return("Convertendo polegadas para centímetros: " + sizeCm);

  }
}
