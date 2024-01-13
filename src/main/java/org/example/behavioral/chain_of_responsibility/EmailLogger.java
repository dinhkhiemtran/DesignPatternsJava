package org.example.behavioral.chain_of_responsibility;

public class EmailLogger extends Logger {
  public EmailLogger(LogLevel logLevel) {
    super(logLevel);
  }

  @Override
  protected void writeMessage(String message) {
    System.out.println("Email Logger: " + message);
  }
}
