package org.example.behavioral.chain_of_responsibility;

public class FilterLogger extends Logger {
  public FilterLogger(LogLevel logLevel) {
    super(logLevel);
  }

  @Override
  protected void writeMessage(String message) {
    System.out.println("Filter Logger: " + message);
  }
}
