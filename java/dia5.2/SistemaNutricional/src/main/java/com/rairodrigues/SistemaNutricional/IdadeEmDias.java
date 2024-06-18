package com.rairodrigues.SistemaNutricional;

import java.time.LocalDateTime;
import java.time.Duration;

public class IdadeEmDias {

  public long calcularIdadeEmDias(String nascimento) {

    LocalDateTime hoje = LocalDateTime.now();
    LocalDateTime diaNascimento = LocalDateTime.parse(nascimento);

    Duration duracao = Duration.between(diaNascimento, hoje);
    long quantidadeDias = duracao.toDays();

    return quantidadeDias;
  }

}