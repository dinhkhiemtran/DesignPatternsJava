package org.example.behavioral.chain_of_responsibility;

public class ConsoleLogger extends Logger {
  public ConsoleLogger(LogLevel logLevel) {
    super(logLevel);
  }

  @Override
  protected void writeMessage(String message) {
    System.out.println("Console Logger: " + message);
  }
}
