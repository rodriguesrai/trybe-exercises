package com.betrybe.electronic;

/**
 * The type Application.
 */
public class Application {

  public static void main(String[] args) {
    Television television = new Television("Phillips", "LCD", 32);

    System.out.println("Modelo antigo:");
    System.out.println(television.getModel());

    television.setModel("LCD-Ultra");

    System.out.println("Modelo novo:");
    System.out.println(television.getModel());

    String sizeCm = Television.convertToCentimeters(32);
    System.out.println(sizeCm);
  }
}

