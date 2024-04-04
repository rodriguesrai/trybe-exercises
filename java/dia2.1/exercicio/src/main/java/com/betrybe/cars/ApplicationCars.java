package com.betrybe.cars;

public class ApplicationCars {

  public static void main(String[] args) {
    Carro carro = new Carro("Chevrolet", "Onix", 2021);
    Carro carro1 = new Carro("Fiat", "Uno", 2020);
    Carro carro2 = new Carro("Ford", "Ka", 2019);

    System.out.println(Carro.quantidadeDeCarros());

    System.out.println(carro.exibirInformacoes());
  }
}
