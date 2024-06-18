package com.rairodrigues.SistemaNutricional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class SistemaNutricionalApplication {

  public static void main(String[] args) {
    AlertaAniversario alerta = new AlertaAniversario();
    alerta.checarAniversario();
  }
}
