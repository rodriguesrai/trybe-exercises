package com.betrybe.report.service.exception;

public abstract class NotFoundException extends  RuntimeException {
  public NotFoundException(String message) {
    super(message);
  }
}
